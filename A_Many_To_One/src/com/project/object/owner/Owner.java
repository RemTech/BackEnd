package com.project.object.owner;

import java.util.Set;

import javax.persistence.*;

import com.project.object.car.Car;
@Entity
@Table(name="OWNER_INFO")
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OWNER_ID")
private int owner_ID;
	@Column(name="FIRST_NAME")
private String fName;
	@Column(name="LAST_NAME")
private String lName;
	@Column(name="OWNER_AGE")
private int age;
/*many to one*/
@OneToMany
@JoinColumn(name="owner_ID")
Set<Car> cars;
public Owner() {
	super();
}
public Owner(String fName, String lName, int age) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.age = age;
	
}
public Owner(String fName, String lName, int age, Set<Car> cars) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.age = age;
	this.cars = cars;
}
public Owner(int owner_ID, String fName, String lName, int age, Set<Car> cars) {
	super();
	this.owner_ID = owner_ID;
	this.fName = fName;
	this.lName = lName;
	this.age = age;
	this.cars = cars;
}
public int getOwner_ID() {
	return owner_ID;
}
public void setOwner_ID(int owner_ID) {
	this.owner_ID = owner_ID;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Set<Car> getCars() {
	return cars;
}
public void setCars(Set<Car> cars) {
	this.cars = cars;
}
@Override
public String toString() {
	return "Owner [owner_ID=" + owner_ID + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", cars=" + cars
			+ "]";
}

}
