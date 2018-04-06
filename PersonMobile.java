package kamboj.ankit.Hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PersonMobile {

	public static void main(String[] args) {

		// Mobile m = new Mobile();
		// m.setMid(105);
		// m.setMname("oppo");

		// Person p = new Person();
		// p.setPid(1);
		// p.setPname("kamal");

		// p.getMobile().add(m);

		// m.setPerson(p);

		Configuration con = new Configuration().configure().addAnnotatedClass(Person.class)
				.addAnnotatedClass(Mobile.class);

		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		// session.save(m);
		// session.save(p);

		tx.commit();

		session.close();

		// System.out.println("successfully updated");

		session = factory.openSession();

		Query<Person> q=session.createQuery("from Person where pid=1");

		List<Person> per = q.list();
		for (Person pr : per) {
			System.out.println(pr);
			System.out.println(pr.getMobile());
		}

	}

}
