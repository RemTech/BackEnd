package com.project.object.university;

import javax.persistence.*;

import org.hibernate.validator.NotNull;

import com.project.object.lecturer.Lecturer;
@Entity
@Table(name="University_List")
public class University {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UNIVERSITY_ID")
   private int uid;
	
	@Column(name="UNIVERSITY_NAME")
   private String universityName;
	
	@Column(name="UNIVERSITY_FEE")
   private Double tuitionFee;
	
	@Column(name="UNIVERSITY_GRADE")
   private Float uniGrade;
	
	@ManyToOne
	@JoinColumn(name="lecturer_ID",referencedColumnName="LECTURER_ID")
   Lecturer lecturer;
public University() {
	super();
	}
public University(String universityName, Double tuitionFee, Float uniGrade, Lecturer lecturer) {
	super();
	this.universityName = universityName;
	this.tuitionFee = tuitionFee;
	this.uniGrade = uniGrade;
	this.lecturer = lecturer;
}
public University( String universityName, Double tuitionFee, Float uniGrade) {
	super();
	this.universityName = universityName;
	this.tuitionFee = tuitionFee;
	this.uniGrade = uniGrade;
	
}
public University(int uid, String universityName, Double tuitionFee, Float uniGrade, Lecturer lecturer) {
	super();
	this.uid = uid;
	this.universityName = universityName;
	this.tuitionFee = tuitionFee;
	this.uniGrade = uniGrade;
	this.lecturer = lecturer;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUniversityName() {
	return universityName;
}
public void setUniversityName(String universityName) {
	this.universityName = universityName;
}
public Double getTuitionFee() {
	return tuitionFee;
}
public void setTuitionFee(Double tuitionFee) {
	this.tuitionFee = tuitionFee;
}
public Float getUniGrade() {
	return uniGrade;
}
public void setUniGrade(Float uniGrade) {
	this.uniGrade = uniGrade;
}
public Lecturer getLecturer() {
	return lecturer;
}
public void setLecturer(Lecturer lecturer) {
	this.lecturer = lecturer;
}
@Override
public String toString() {
	return "University [uid=" + uid + ", universityName=" + universityName + ", tuitionFee=" + tuitionFee
			+ ", uniGrade=" + uniGrade + ", lecturer=" + lecturer + "]";
}

}
