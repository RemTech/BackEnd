package com.project.object.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.object.course.Course;
import com.project.object.student.Student;
import com.project.util.AHibUtil;

public class client {
	
	public static void main(String[] args) {
		SessionFactory sf = null;
		Session ss = null;
	    Transaction tx = null;
		try {
            sf=AHibUtil.getSessionFactory();
            ss=sf.openSession();
            tx=ss.beginTransaction();
            Course course=new Course("CompSci204",6,"Computer-Science");
            Student student=new Student("Remi","Osisanya","57 Greenway Chapel Park",32,course);
            ss.save(course);
            ss.save(student);
            tx.commit();
	        }
		catch(HibernateException hexp) {
		if(tx!=null) {
			tx.rollback();
		}else {
			System.err.println("Error:"+" "+hexp.getLocalizedMessage());
		}
	}finally {
		AHibUtil.closeConnections(sf, ss, tx);
	}

}
}
