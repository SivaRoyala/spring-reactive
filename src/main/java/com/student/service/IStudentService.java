package com.student.service;

import com.student.modal.StudentDto;

import reactor.core.publisher.Mono;

public interface IStudentService {
	
	Mono<StudentDto> getStudentDetails(Long id);

}
