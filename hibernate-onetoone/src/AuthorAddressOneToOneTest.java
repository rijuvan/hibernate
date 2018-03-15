import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.soft.model.Address;
import com.soft.model.Author;


public class AuthorAddressOneToOneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author=new Author();
		author.setAuthorName("Amit Singh");
		
		Address ad1=new Address();
		ad1.setCity("noida");
		ad1.setState("UP");
		Address ad2=new Address();
		ad2.setCity("New Delhi");
		ad2.setState("Delhi -1");
		
		author.setAdress(ad1);
		
		//author.getAddresses().add(ad1);
		//author.getAddresses().add(ad2);
		
		
		SessionFactory sessionFactory=	new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(author);
		session.save(ad1);
		
		session.beginTransaction().commit();
		
		session.close();
		
	}

}
