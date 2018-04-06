package kamboj.ankit.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PerPass {

	public static <R> void main(String[] args) {

		Person1 person = new Person1();
		person.setId(1);
		person.setName("amrit");

		Passport passport = new Passport();
		passport.setPid(101);
		passport.setPname("india");
		
		passport.setPerson(person);
		
		person.setPassport(passport);
		

		Configuration con = new Configuration().configure().addAnnotatedClass(Person1.class)
				.addAnnotatedClass(Passport.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(person);
		session.save(passport);

		tx.commit();

		session.close();
		
		System.out.println("updated");
		
		session = factory.openSession();
		
		Query<R> qry=session.createQuery("from Person1");
		
		List<Person1> list=(List<Person1>)qry.list();
		System.out.println(list.get(0).getPassport());
	
	}
}
