package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class HibernateConfiguration {
	public static final SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		return cfg.buildSessionFactory();
	}
}
