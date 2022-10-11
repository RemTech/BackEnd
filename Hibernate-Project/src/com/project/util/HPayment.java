package com.project.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/* static method to conveniently handle session connection */

public class HPayment {
	static SessionFactory factory;
	
 static {
	 Configuration cfg= new Configuration();
	 cfg=cfg.configure();
	 factory=cfg.buildSessionFactory();
 }
 public static SessionFactory getSessionFactory() {
	 return factory;
 }
 public static void closeConnections(SessionFactory sf,Session ss,Transaction tx) {
	 if (sf!=null) {
		sf.close(); 
		System.out.println("SessionFactory successfully closed");
	 }else {
		 System.err.println("SessionFactory not successfully closed");
	 }
	 if(ss!=null) {
		 //ss.clear();
		 ss.close();
		 System.out.println("Session successfully closed");
	 }else {
		 System.err.println("Session not successfully closed");
	 }
	 if(tx.wasCommitted()) {
		 System.out.println("commited successfully");
	 }
  }
}
