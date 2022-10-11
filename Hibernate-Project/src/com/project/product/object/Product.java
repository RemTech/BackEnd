package com.project.product.object;
//import java.sql.Date;
import java.util.*;

import com.project.payment.object.Payment;
public class Product {
/*POJO*/
	private int pid;
	private String productName;
	private int price;
	private int vat;
	private String manufacturer;
	private Date date;
    Payment payment;
	
	/* Constructors and Mutators/Accessors */
	public Product() {
	}
     
	public Product(String productName, int price, int vat, String manufacturer, Date date, Payment payment) {
		super();
		this.productName = productName;
		this.price = price;
		this.vat = vat;
		this.manufacturer = manufacturer;
		this.date = date;
		this.payment = payment;
	}
	
	public Product(int pid, String productName, int price, int vat, String manufacturer, Date date, Payment payment) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
		this.vat = vat;
		this.manufacturer = manufacturer;
		this.date = date;
		this.payment = payment;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + ", vat=" + vat
				+ ", manufacturer=" + manufacturer + ", date=" + date + ", payment=" + payment + "]";
	}
	
	
	
}
