package com.student.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.student.entity.Student;



import com.student.entity.Student;

public class CustomStudentRepositoryImpl implements CustomStudentRepository {
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Student> getStudentsByCourse(String course) {

		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from student s where s.course=:course";
		
		Query<Student> query = session.createQuery(queryString);
		query.setString("cityName", course);
		
		List<Student>  list = (List<Student>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Course Name Records Not In The DB");
		}
	}
	

	
}
