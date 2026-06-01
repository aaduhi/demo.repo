package Com.user;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Com.Config.HibernateUtil;
import Com.model.Address;
import Com.model.Student;
public class Test {
	
	public static void main(String[] args) {
		Session ss=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=ss.beginTransaction();
		
		Address a=new Address();
		a.setPincode(123456457);
		a.setAreaname("katraj");
		a.setCityname("pune");
		
		Student s=new Student();
		
		s.setRollno(121);
		s.setName("aditi");
	    s.setAdddr(a);
	    
	    ss.persist(s);
	    tx.commit();
	    ss.close();
		
	}

}
