package kamboj.ankit.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Veh1TwoFour {

	public static void main(String[] args) {
		
		Vehicle1 vehicle=new Vehicle1();
		vehicle.setVname("car");
		
		TwoWheller bike=new TwoWheller();
		bike.setVname("pulsar");
		bike.setSteeringHandle("Handle");
		
		
		FourWheller car=new FourWheller();
		car.setVname("swift");
		car.setSteeringWheel("Wheel");

		Configuration con = new Configuration().configure().addAnnotatedClass(Vehicle1.class)
				.addAnnotatedClass(TwoWheller.class).addAnnotatedClass(FourWheller.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		tx.commit();
		
		session.close();

	}

}
