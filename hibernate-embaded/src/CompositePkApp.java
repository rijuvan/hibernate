import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soft.model.User;
import com.soft.model.UserId;

import connection.util.HibernateUtil;

public class CompositePkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserId userId = new UserId();

		userId.setEmailId("rijuvan@yahoo.com");
		userId.setPhone("4558");

		User user = new User();

		user.setUsername(userId);

		user.setRole("Admin");
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx=session.getTransaction();
		
		tx.begin();
		
		session.save(user);
		
		tx.commit();
		session.close();
		
		System.out.println("User Added");
		

	}

}
