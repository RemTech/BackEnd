package com.project.payment.object;

import java.util.*;
//import java.sql.Date;

public class Payment {
 /* POJO */
	private int pid;
	private Date date;
	private float price;
	private String payFormat;
	private String product;
	private float tax;
	private float vat;
	public Payment() {
	}
	public Payment(Date date, float price, String payFormat, String product, float tax, float vat) {
		super();
		this.date = date;
		this.price = price;
		this.payFormat = payFormat;
		this.product = product;
		this.tax = tax;
		this.vat = vat;
	}
	public Payment(int pid, Date date, float price, String payFormat, String product, float tax, float vat) {
		super();
		this.pid = pid;
		this.date = date;
		this.price = price;
		this.payFormat = payFormat;
		this.product = product;
		this.tax = tax;
		this.vat = vat;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPayFormat() {
		return payFormat;
	}
	public void setPayFormat(String payFormat) {
		this.payFormat = payFormat;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getVat() {
		return vat;
	}
	public void setVat(float vat) {
		this.vat = vat;
	}
	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", date=" + date + ", price=" + price + ", payFormat=" + payFormat + ", product="
				+ product + ", tax=" + tax + ", vat=" + vat + "]";
	}
	
	
	
}
