package com.project.payment.util;

import org.hibernate.SessionFactory;
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
}
