package com.project.object.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.object.course.Course;
//import com.project.object.course.Course;
import com.project.object.lecturer.Lecturer;
import com.project.object.student.Student;
//import com.project.object.student.Student;
import com.project.object.university.University;
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
            
            /*String firstName, String lastName, String email, String qualification,long phoneNumber, Set<University> university*/
            University university = new University("Ghana-University",new Double(100.00),new Float(2.1));
            ss.save(university);
            University university1 = new University("University of Ibadan",new Double(500.00),new Float(3.1));
            ss.save(university1);
            University university2 = new University("University of Kenya",new Double(170.00),new Float(4.1));
            ss.save(university2);
            University university3 = new University("University of Mali",new Double(200.00),new Float(5.1));
            ss.save(university3);
            Lecturer lecturer=new Lecturer("kojo","Antwi","kojo@ghana_university.com","Phd",new Long(20203345));             
            university.setLecturer(lecturer);
            university1.setLecturer(lecturer);
            university2.setLecturer(lecturer);
            university3.setLecturer(lecturer);
            ss.save(lecturer);
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
