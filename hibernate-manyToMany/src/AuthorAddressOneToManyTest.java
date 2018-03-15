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


public class AuthorAddressOneToManyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author=new Author();
		author.setAuthorName("Amit Singh");
		Author author1=new Author();
		author1.setAuthorName("Abhay Singh");
		Address ad1=new Address();
		ad1.setCity("noida");
		ad1.setState("UP");
		Address ad2=new Address();
		ad2.setCity("New Delhi");
		ad2.setState("Delhi -1");
		// for reverese relation @manyToOne
		ad1.getAuthors().add(author);
		ad1.getAuthors().add(author1);
		ad2.getAuthors().add(author);
		ad2.getAuthors().add(author1);
		List<Address> l1=new ArrayList<Address>();
		l1.add(ad1);
		l1.add(ad2);
		author.getAdresses().add(ad1);
		author.getAdresses().add(ad2);
		author1.getAdresses().add(ad1);
		author1.getAdresses().add(ad2);
		//author.getAddresses().add(ad1);
		//author.getAddresses().add(ad2);
		
		
		SessionFactory sessionFactory=	new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(author);
		session.save(author1);
		session.save(ad1);
		session.save(ad2);
		
		session.beginTransaction().commit();
		
		ad1=(Address)session.get(Address.class,20);
		
		System.out.println(ad1.getAuthors());
		session.close();
		
	}

}
