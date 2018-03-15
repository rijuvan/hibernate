import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soft.model.Address;
import com.soft.model.Department;

import connection.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setCity("Noida");
		add.setState("UP");
		add.setCountry("INDIA");

		Department dept = new Department();

		dept.setDeptName("Infogain-Sales");
		dept.setAddress(add);
	Session session=HibernateUtil.getSessionFactory().openSession();	
	
	Transaction tx=session.getTransaction();
	tx.begin();
	
	session.save(dept);
	
	tx.commit();
	
	System.out.println("Depatment Added");
		
		
		

	}

}
