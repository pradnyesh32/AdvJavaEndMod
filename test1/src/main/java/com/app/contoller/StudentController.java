package com.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stud;
	@GetMapping("/")
	public List<Student> getStudents(){
		List<Student> slist=stud.studentsList();
		return slist;
		
	}
	
	@GetMapping("/register")
	public String registerStudent(@RequestParam String sname,@RequestParam String average ) {
			Student s = new Student(sname,Double.parseDouble(average));
			String str = stud.addStudent(s);
		
		return str;
		
	}

}
