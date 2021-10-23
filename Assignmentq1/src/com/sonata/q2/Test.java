package com.sonata.q2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setBankId(1);
		b.setBankName("SBI");
		
		SavingsAccount s1=new SavingsAccount();
		s1.setBankId(2);
		s1.setBankName("CBI");
		s1.setAccountType("savings");
		
		CurrentAccount c1=new CurrentAccount();
		c1.setBankId(3);
		c1.setBankName("SCB");
		c1.setAccType("current");
		
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		Session s=f.openSession();
		s.beginTransaction();
		s.save(b);
		s.save(s1);
		s.save(c1);
		s.getTransaction().commit();
		s.close();
	}
}
