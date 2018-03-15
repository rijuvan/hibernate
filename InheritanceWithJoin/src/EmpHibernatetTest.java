import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.soft.model.ContractEmployee;
import com.soft.model.Employee;
import com.soft.model.RegularEmployee;


public class EmpHibernatetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setName("Amit Singh");
		ContractEmployee cemployee=new ContractEmployee();
		cemployee.setName("Contract EMP Anuj");
		cemployee.setContractperiod("two year");
		cemployee.setPayperhour(128);
		RegularEmployee remployee=new RegularEmployee();
		remployee.setName("Regular EMP Pawan");
		remployee.setBonus(3000);
		remployee.setSallary(12345);
		
		SessionFactory sessionFactory=	new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(employee);
		session.save(cemployee);
		session.save(remployee);
		
		session.beginTransaction().commit();
		List<Employee> list=session.createQuery("from ContractEmployee").list();
		
		for(Employee e:list)
		{
			System.out.print(e.getName());
		}
	}

}
