package com.project.product.object;
//import java.sql.Date;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.payment.object.Payment;
import com.project.util.HPayment;

public class ProductClient {
	
	public static void main(String[] args) {
		/* Logic for Execution */
		SessionFactory sf;
	    Session ss;
	    Transaction tx;
		try {
              sf=HPayment.getSessionFactory();
              ss=sf.openSession();
              tx=ss.beginTransaction();
              /*Date date, float price, String payFormat, String product, float tax, float vat*/
              Payment payment= new Payment(new Date(),20.00f,"Card","Mobile top-up",5.00f,1.5f);
              Product product=new Product("Nigeria-Mobile",10,3,"Nigerian-Telecommunication",new Date(),payment);
              ss.save(payment);
              ss.save(product);
              tx.commit();
              HPayment.closeConnections(sf, ss, tx);
              }catch(HibernateException sql) {
		     sql.getMessage();
	        } 
		}
}
