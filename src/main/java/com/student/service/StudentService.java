package com.student.service;

import org.springframework.stereotype.Service;

import com.student.modal.StudentDto;

import reactor.core.publisher.Flux;
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

	@Override
	public Flux<StudentDto> getAllStudentDetails() {
	
		StudentDto dto1 = new StudentDto();
		dto1.setId(100L);
		dto1.setFirstName("Royala");
		dto1.setLastName("Jaanvitha");
		
		StudentDto dto2 = new StudentDto();
		dto2.setId(101L);
		dto2.setFirstName("Royala");
		dto2.setLastName("Siva");
		
		return Flux.just(dto1,dto2);
	}

}
