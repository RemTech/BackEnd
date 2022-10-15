package com.project.object.student;

import javax.persistence.*;

import com.project.object.course.Course;
@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="STUDENT_ID")
 private int sid;
@Column(name="STUDENT_FIRSTNAME")
 private String firstName;
@Column(name="STUDENT_LASTNAME")
 private String lastName;
@Column(name="STUDENT_ADDRESS")
 private String address;
@Column(name="STUDENT_AGE")
 private int age;
@OneToOne
@JoinColumn(name="COURSE_ID")
  Course course;
 
public Student() {
}
public Student( String firstName, String lastName, String address, int age, Course course) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.age = age;
	this.course = course;
}
public Student(int sid, String firstName, String lastName, String address, int age, Course course) {
	super();
	this.sid = sid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.age = age;
	this.course = course;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
			+ ", age=" + age + ", course=" + course + "]";
}

 }
