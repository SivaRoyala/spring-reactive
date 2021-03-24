package com.student.service;

import org.springframework.stereotype.Service;

import com.student.modal.StudentDto;

import reactor.core.publisher.Mono;

@Service
public class StudentService implements IStudentService {

	@Override
	public Mono<StudentDto> getStudentDetails(Long id) {
		StudentDto dto = new StudentDto();
		dto.setId(100L);
		dto.setFirstName("Royala");
		dto.setLastName("Jaanvitha");
		return Mono.just(dto);
	}

}
