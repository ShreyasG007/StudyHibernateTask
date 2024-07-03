package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.config.HibernateConfiguration;
import com.entity.Employee;

public class EmployeeDao {
	public void getEmployees() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		transaction.commit();
	}

	public boolean insertEmployee(Employee employee) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
		return true;
	}

	public boolean deleteEmployee(Employee e) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		
		openSession.delete(e);
		
		transaction.commit();
		
		return true;
		
	}

	public void employeeByProfile(Employee e) {
		
		 String profile = e.getProfile();
		 
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		
		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("profile", profile));
		List<Employee> list = criteria.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		transaction.commit();
		
	}

	public void getMaxSalary() {
		 
			SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
			Session openSession = sessionFactory.openSession();
			Transaction transaction = openSession.beginTransaction();
			
			Criteria criteria = openSession.createCriteria(Employee.class);
			criteria.setProjection(Projections.max("salary"));
			 Double maxSalary2 = (Double) criteria.uniqueResult();
			
			List maxSalary = criteria.list();
			System.out.println("Max Salary : "+maxSalary);
			
			Criteria employeeCriteria = openSession.createCriteria(Employee.class);
            employeeCriteria.add(Restrictions.eq("salary", maxSalary2));
            List<Employee> employeesWithMaxSalary = employeeCriteria.list();
            
            
            for (Employee employee : employeesWithMaxSalary) {
                System.out.println(employee);
            }
			
			
			transaction.commit();
		
	}

	public void getMinSalary() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		
		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.setProjection(Projections.min("salary"));
		 Double minSalary2 = (Double) criteria.uniqueResult();
		
		List minSalary = criteria.list();
		System.out.println("Min Salary : "+minSalary);
		
		Criteria employeeCriteria = openSession.createCriteria(Employee.class);
        employeeCriteria.add(Restrictions.eq("salary", minSalary2));
        List<Employee> employeesWithMinSalary = employeeCriteria.list();
        
        
        for (Employee employee : employeesWithMinSalary) {
            System.out.println(employee);
        }
		
		
		transaction.commit();
		
	}

	public void getEmployeeSalaryLessThanTwentyK() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("salary", 20000.00));
		List<Employee> list = criteria.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
	}
}
