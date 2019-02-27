package com.mainangular.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainangular.beans.Student;
import com.mainangular.beans.StudentRegistration;
import com.mainangular.beans.StudentRegistrationReply;

@RestController
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(method = RequestMethod.POST, value = "/register")

	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		// We are setting the below value just to reply a message back to the caller
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
		stdregreply.setRegistrationNumber(student.getRegistrationNumber());
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allstudent")
	@ResponseBody
	public List<Student> getAllStudents() {

		return StudentRegistration.getInstance().getStudentRecords();

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/{regdNum}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
	System.out.println("In deleteStudentRecord");   
	    return StudentRegistration.getInstance().deleteStudent(regdNum);
	}

}
