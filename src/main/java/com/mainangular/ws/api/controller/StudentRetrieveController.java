package com.mainangular.ws.api.controller;

import java.util.List;

import com.mainangular.ws.api.beans.Student;
import com.mainangular.ws.api.beans.StudentRegistration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class StudentRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET)
	
	@ResponseBody
	public List<Student> getAllStudents() {
		
		return StudentRegistration.getInstance().getStudentRecords();
		
	}

}
