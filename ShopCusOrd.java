package kamboj.ankit.Hibernate;

import java.util.List;
import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ShopCusOrd {

	public static <R> void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Products.class);

		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		Random r = new Random();

		for (int i = 1; i <=50; i++) {
			Products p = new Products();
			p.setPid(i);
			p.setPname("name: " + i);
			p.setPcost(r.nextInt(100));

			session.save(p);

		}
		
		tx.commit();
		session.close();

		System.out.println("*************updated**********");

	}

}
