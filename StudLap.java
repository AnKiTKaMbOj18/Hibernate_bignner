package kamboj.ankit.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudLap {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");

		Student stud = new Student();
		stud.setRollno(1);
		stud.setName("amit");
		stud.setMarks(60);
		stud.getLaptop().add(laptop);

		laptop.getStudent().add(stud);

		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class);

		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(laptop);
		session.save(stud);

		tx.commit();

		session.close();

		System.out.println("*************updated**********");

	}

}
