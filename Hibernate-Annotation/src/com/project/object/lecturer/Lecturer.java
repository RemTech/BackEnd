package com.project.object.lecturer;


import java.io.Serializable;
//import java.util.List;
import java.util.Set;

import javax.persistence.*;



//import com.project.object.course.Course;
//import com.project.object.student.Student;
import com.project.object.university.University;
@Entity
@Table(name="Lecturer_Details")
public class Lecturer {

	
/** one to many mapping **/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LECTURER_ID")
	private int lecturer_ID;
	
	@Column(name="LECTURER_FIRST_NAME")
	private String firstName;
	
	@Column(name="LECTURER_LAST_NAME")
	private String lastName;
	
	@Column(name="LECTURER_EMAIL")
	private String email;
	
	@Column(name="LECTURER_QUALIFICATION")
	private String qualification;
	
	@Column(name="LECTURER_PHONE")
	private long phoneNumber ;
	
	@OneToMany(mappedBy="lecturer")
	Set<University> university;
	
	public Lecturer() {
		super();
	}
	public Lecturer( String firstName, String lastName, String email, String qualification,
			long phoneNumber, Set<University> university) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.qualification = qualification;
		this.phoneNumber = phoneNumber;
		this.university = university;
	}
	public Lecturer( String firstName, String lastName, String email, String qualification,
			long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.qualification = qualification;
		this.phoneNumber = phoneNumber;
		
	}
	public Lecturer(int lecturer_ID, String firstName, String lastName, String email, String qualification,
			long phoneNumber, Set<University> university) {
		super();
		this.lecturer_ID = lecturer_ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.qualification = qualification;
		this.phoneNumber = phoneNumber;
		this.university = university;
	}
	public int getLecturer_ID() {
		return lecturer_ID;
	}
	public void setLecturer_ID(int lecturer_ID) {
		this.lecturer_ID = lecturer_ID;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<University> getUniversity() {
		return university;
	}
	public void setUniversity(Set<University> university) {
		this.university = university;
	}
	
	@Override
	public String toString() {
		return "Lecturer [lecturer_ID=" + lecturer_ID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", qualification=" + qualification + ", phoneNumber=" + phoneNumber
				+ ", university=" + university + "]";
	}
	
}
