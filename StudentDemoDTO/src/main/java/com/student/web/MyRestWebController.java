package com.student.web;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentBasicDetailsDTO;
import com.student.entity.Student;
import com.student.service.IStudentService;
import com.student.dto.SudentSavePostDTO;

@RestController
@RequestMapping("/app")
@Validated
public class MyRestWebController {
	
	@Autowired
	IStudentService service;
	@GetMapping("/students")
	
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("/studentlist")
	public List<Student> getAllStudent(@RequestParam String course)
	{
		return service. getStudentsByCourse(course);
	}
	
	@PostMapping("/student")
	public ResponseEntity<StudentBasicDetailsDTO> saveStudent(@RequestBody @Valid SudentSavePostDTO s)
	{
		
		System.out.println("--->> "+s.getStudentName()+" - "+s.getAge());
		
		StudentBasicDetailsDTO dto =  service.saveStudent(s);
		return new ResponseEntity<StudentBasicDetailsDTO>(dto,HttpStatus.OK);
	}
	

}
