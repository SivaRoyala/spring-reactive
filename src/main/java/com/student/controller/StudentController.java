package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.modal.StudentDto;
import com.student.service.IStudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/ping")
	public Mono<String> ping(){
		return Mono.just("Service working!");
	}
	
	@GetMapping("/{id}")
	public Mono<StudentDto> getStudentDetails(@PathVariable Long id){
		return studentService.getStudentDetails(id);
	}
	
	@GetMapping("/")
	public Flux<StudentDto> getAllStudentDetails(){
		return studentService.getAllStudentDetails();
	}

}
