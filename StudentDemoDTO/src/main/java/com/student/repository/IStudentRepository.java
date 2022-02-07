package com.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer> ,
   CustomStudentRepository{

	
}
