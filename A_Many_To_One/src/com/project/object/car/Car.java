package com.project.object.car;

import javax.persistence.*;

import com.project.object.owner.Owner;
@Entity
@Table(name="CAR_INFO")
 public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CAR_ID")
 private int car_ID;
	
	@Column(name="CAR_MODEL")
 private String carModel;
	
	@Column(name="CAR_COLOUR")
 private String carColour;
	
	@Column(name="CAR_PRICE")
 private Double carPrice;
	
 /* one to many */
	@ManyToOne()
	@JoinColumn(name="owner_ID")
 Owner owners;
public Car() {
	super();
}
public Car(String carModel, String carColour, Double carPrice) {
	super();
	this.carModel = carModel;
	this.carColour = carColour;
	this.carPrice = carPrice;
	
}
public Car(String carModel, String carColour, Double carPrice, Owner owners) {
	super();
	this.carModel = carModel;
	this.carColour = carColour;
	this.carPrice = carPrice;
	this.owners = owners;
}
public Car(int car_ID, String carModel, String carColour, Double carPrice, Owner owners) {
	super();
	this.car_ID = car_ID;
	this.carModel = carModel;
	this.carColour = carColour;
	this.carPrice = carPrice;
	this.owners = owners;
}
public int getCar_ID() {
	return car_ID;
}
public void setCar_ID(int car_ID) {
	this.car_ID = car_ID;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getCarColour() {
	return carColour;
}
public void setCarColour(String carColour) {
	this.carColour = carColour;
}
public Double getCarPrice() {
	return carPrice;
}
public void setCarPrice(Double carPrice) {
	this.carPrice = carPrice;
}
public Owner getOwners() {
	return owners;
}
public void setOwners(Owner owners) {
	this.owners = owners;
}
@Override
public String toString() {
	return "Car [car_ID=" + car_ID + ", carModel=" + carModel + ", carColour=" + carColour + ", carPrice=" + carPrice
			+ ", owners=" + owners + "]";
}

}
