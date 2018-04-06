package kamboj.ankit.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProCusOrd {

	public static void main(String[] args) {
		
		Products p=new Products();
		
		Customers c=new Customers();
		
		Orders o=new Orders();

		Configuration con = new Configuration().configure().addAnnotatedClass(Products.class)
				.addAnnotatedClass(Customers.class);

		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		tx.commit();

		session.close();

		System.out.println("*********// updated //*********");
	}

}
