package com.project.payment.object;
import java.util.*;
//import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.payment.util.HPayment;

public class PaymentClient {
	
public static void main(String[] args) {
	 SessionFactory sf;
	  Transaction tx;
	 Session os;
	 boolean check=false;
	 try {	/* Logic Execution */
		 sf=HPayment.getSessionFactory();
		 os=sf.openSession();
		 tx=os.beginTransaction();
		/* create obj */
		Payment payment=new Payment(new Date(),30.30f,"Card","Educational Books",20.00f,3.00f);
		Payment payment1=new Payment(new Date(),30.50f,"Cash","Science",20.00f,10.00f);
		os.save(payment);
		os.save(payment1);
		tx.commit();
		if(tx.wasCommitted()){
			check=true;
			System.out.println("Action was successfully"+""+check);
		}else {
			System.err.println("Action was not done");		
			}
		os.close();
		sf.close();
		} catch(HibernateException exp) {
			System.out.println("Error:"+""+exp.getMessage());
		}finally {
		}
	 }
}
