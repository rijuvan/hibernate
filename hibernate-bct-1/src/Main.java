
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soft.domain.Employee;

import connection.util.HibernateUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee();
		/*
		 * emp.setEmpName("Sumit Singh"); emp.setSal(1234.78);
		 * 
		 * Session session =HibernateUtil.getSessionFactory().openSession();
		 * Transaction tx=session.beginTransaction();
		 * 
		 * session.save(emp); tx.commit(); session.close();
		 */

		/*
		 * Session session2=HibernateUtil.getSessionFactory().openSession();
		 * 
		 * Employee emp1=(Employee)session2.get(Employee.class,3);
		 * 
		 * System.out.println(emp1); session2.close(); // Code to find all
		 * employees in the table
		 */
		/*
		 * Session session3=HibernateUtil.getSessionFactory().openSession();
		 * 
		 * Query query=session3.createQuery("from Employee");
		 * 
		 * List<Employee> empList=query.list();
		 * 
		 * for(Employee em:empList) System.out.println(em);
		 * 
		 * session3.close();
		 */

		// Code to delete entity

		/*Session session4 = HibernateUtil.getSessionFactory().openSession();
		Transaction tx2 = session4.beginTransaction();
		
		Employee emp2=new Employee();
		emp2=(Employee) session4.get(Employee.class,3);
		session4.delete(emp2);
		tx2.commit();
		session4.close();

		System.out.println("Object is delete");*/
		
		Session session5 = HibernateUtil.getSessionFactory().openSession();
		Transaction tx2 = session5.beginTransaction();
		Employee emp4=new Employee();
		
		emp4=(Employee)session5.get(Employee.class, 4);
		
		emp4.setEmpName("Ajay Singg");

		tx2.commit();
		session5.close();
		
		System.out.println("Object is updated" + emp4.getEmpId());
		
		

	}

}
