package kamboj.ankit.HibDemo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentMain {

	public static void main(String[] args) {

		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
/*		Random r=new Random();
		for(int i=1;i<=50;i++){
			Student s=new Student();
			s.setRollno(i);
			s.setName("name"+i);
			s.setMarks(r.nextInt(100));
			
			session.save(s);
		}
		*/
		Query<Student> qry=session.createQuery("from Student");
		List<Student> students=qry.list();
		for(Student s: students){
			System.out.println(s);
		}
		
		Query<Student> q=session.createQuery("delete Student where rollno ='50'");
		int result=q.executeUpdate();
		System.out.println(result);
		
		
		tx.commit();  
		
		session.close();
	}

}
