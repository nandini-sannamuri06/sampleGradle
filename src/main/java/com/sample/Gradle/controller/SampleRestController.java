package com.sample.Gradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Gradle.model.Student;
import com.sample.Gradle.repository.StudentRepository;

@RestController
public class SampleRestController {
	
	@Autowired
	public StudentRepository repo;
	
	@RequestMapping(value="getStudent")
	public ResponseEntity<List<Student>> getMessage(){
		List<Student> data = repo.findAll();
		return new ResponseEntity<List<Student>>(data,HttpStatus.CREATED);
		
	}
	@RequestMapping(value="insertStudent", method = RequestMethod.POST)
	public ResponseEntity<String> createStudent(@RequestBody Student student){
		repo.save(student);
		return new ResponseEntity<String>("Student is saved successfully",HttpStatus.CREATED);
		
	}
	

}
