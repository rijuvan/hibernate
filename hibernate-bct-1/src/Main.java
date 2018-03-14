
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soft.domain.Employee;

import connection.util.HibernateUtil;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.setEmpName("Amit Singh");
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(emp);
		tx.commit();
		session.close();
		
		
		
			}
		
	}
