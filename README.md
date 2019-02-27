
#STEPS TO GITHUB

Create new repository in GitHub

echo "# spring-rest-service" >> README.md

git init

git add README.md

git commit -m "first commit"

git remote add origin https://github.com/slider44/spring-rest-service.git

git push -u origin master

#STEPS TO PUSH CODE (LOCAL)

git init .

git remote add origin https://github.com/slider44/slider44.github.io.git

(if has existing remote) git remote remove origin

git checkout -b local (create new branch- where local is a branch name)

git add .

git commit -m "Message"

git push origin local


#HOW TO CLEAN AND RUN

mvnw clean package (CMD and go to project home directory)


#INFO
The @GetMapping("/notes") annotation is a short form of @RequestMapping(value="/notes", method=RequestMethod.GET)




