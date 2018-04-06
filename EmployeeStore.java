package kamboj.ankit.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeStore {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setFirstName("ajay");
		emp1.setLastName("kashyap");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		emp1=session.get(Employee.class,1);
		
		tx.commit();
		
		System.out.println(emp1);
	}

}
