package com.student.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
public class SudentSavePostDTO {
	@NotNull(message = "Name is empty")
	private String studentName;
	@Min(value = 50,message = "Age limit is 50")
	private int age;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SudentSavePostDTO(@NotNull(message = "Name is empty") String studentName,
			@Min(value = 50, message = "Age limit is 50") int age) {
		super();
		this.studentName = studentName;
		this.age = age;
	}
	
}
