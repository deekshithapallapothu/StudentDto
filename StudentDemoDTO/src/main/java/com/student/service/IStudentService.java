package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.dto.StudentBasicDetailsDTO;
import com.student.dto.SudentSavePostDTO;
import com.student.entity.Student;
@Service
public interface IStudentService {
	
	public List<Student> getAllStudent();
	public List<Student>  getStudentsByCourse(String course);
	public StudentBasicDetailsDTO saveStudent(SudentSavePostDTO student);
	
}
