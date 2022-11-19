package com.project.object.annotation.client;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.jdbc.util.HibAno;
import com.project.object.car.Car;
import com.project.object.owner.Owner;


public class Service {
 
       public static void main(String[] args) {
    	Transaction tx = null;
		SessionFactory sf= null;
		  Session sxc=null;
		  try {
			  
			sf=HibAno.getSessionFactory();
			sxc=sf.openSession();
			tx=sxc.beginTransaction();
			Car cars1=new Car("Land-Rover","Green",new Double(2000.00));
			sxc.save(cars1);
			Car cars2=new Car("Bugatti","Blue",new Double(5000.00));
			sxc.save(cars2);
			Car cars3=new Car("Maybach","Navy",new Double(4066.00));
			sxc.save(cars3);
			Set<Car>cars=new HashSet<Car>();
			cars.add(cars1);
			cars.add(cars2);
			cars.add(cars3);
			Owner owner=new Owner("Remi","Osisanya",21,cars);
			sxc.save(owner);
		   /*cars1.setOwners(owner);
		   cars2.setOwners(owner);
		   cars3.setOwners(owner);
		   sxc.save(owner);*/
		   tx.commit();
		   Car resultSet=(Car)sxc.get(Car.class,52);
		   PrintWriter pw = new PrintWriter(System.out,true);
           pw.println(resultSet.getCar_ID()+"  and  "+resultSet.getCarPrice());
		  }
		  catch(HibernateException hexp) {
			  hexp.getMessage(0);
		  }finally {
			  HibAno.closeConnections(sf, sxc, tx);
		  }

}
}

