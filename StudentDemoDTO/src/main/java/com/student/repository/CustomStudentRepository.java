package com.student.repository;
import java.util.List;
import com.student.entity.Student;
public interface CustomStudentRepository {
	
	
	public List<Student> getStudentsByCourse(String course);
	
	
}
