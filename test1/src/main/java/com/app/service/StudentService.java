package com.app.service;

import java.util.List;

import com.app.pojos.Student;

//import org.springframework.stereotype.Service;


public interface StudentService {

	List<Student> studentsList();

	String addStudent(Student s);
	
	
	

}
