package kamboj.ankit.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		AlienName an=new AlienName();
		an.setFname("mohit");
		an.setLname("rana");
		an.setMname("chauhan");
		
		Alien al = new Alien();
		al.setAid(101);
		al.setColor("white");
		al.setAname(an);
		

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(al);
		
		tx.commit();
		
		System.out.println(al);
	}
}
