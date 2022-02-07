package com.student.service;

import java.util.List;


import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentBasicDetailsDTO;
import com.student.dto.SudentSavePostDTO;
import com.student.entity.Student;
import com.student.repository.IStudentRepository;
import com.student.util.StudentDTOConversionClass;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository repository;
	@Autowired
	StudentDTOConversionClass dtoConvertion;
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> list = (List<Student>) repository.findAll();
	     return list;
	}

	@Override
	public List<Student> getStudentsByCourse(String course) {
		// TODO Auto-generated method stub
		return repository.getStudentsByCourse(course);
	}

	@Override
	public StudentBasicDetailsDTO saveStudent(SudentSavePostDTO studentDto) {
		// TODO Auto-generated method stu
		Student s = dtoConvertion.getStudentFromPostStudentDTO(studentDto);
		
		Student savedObj  = repository.save(s);
		StudentBasicDetailsDTO dtoObj = dtoConvertion.getStudentBasicDetailsDTO(savedObj);
		return dtoObj;
	}
	
}
