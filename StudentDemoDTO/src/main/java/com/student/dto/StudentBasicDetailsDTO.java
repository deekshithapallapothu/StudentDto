package com.student.dto;

import java.time.LocalDate;

public class StudentBasicDetailsDTO {
 private String studentName;
 private String email;
 private int age;
 private LocalDate dateOfBirth;
 private int communicationId;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public int getCommunicationId() {
	return communicationId;
}
public void setCommunicationId(int communicationId) {
	this.communicationId = communicationId;
}
@Override
public String toString() {
	return "StudentBasicDetailsDTO [studentName=" + studentName + ", email=" + email + ", age=" + age + ", dateOfBirth="
			+ dateOfBirth + ", communicationId=" + communicationId + "]";
}

 
}
