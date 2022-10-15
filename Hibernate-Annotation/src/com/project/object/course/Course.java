package com.project.object.course;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="COURSE_ID")
  private int cid;
@Column(name="COURSE_CODE")
  private String courseCode;
@Column(name="COURSE_DURATION")
  private int duration;
@Column(name="COURSE_NAME")
  private String courseName;
  
  public Course() {
}
  public Course(String courseCode, int duration, String courseName) {
		super();
		this.courseCode = courseCode;
		this.duration = duration;
		this.courseName = courseName;
	}
public Course(int cid, String courseCode, int duration, String courseName) {
	super();
	this.cid = cid;
	this.courseCode = courseCode;
	this.duration = duration;
	this.courseName = courseName;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", courseCode=" + courseCode + ", duration=" + duration + ", courseName=" + courseName
			+ "]";
}

}
