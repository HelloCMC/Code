package news;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import weather.HibernateAnnotationUtil;
import weather.Weather;

public class Main {
	private static SessionFactory sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	
	public static void main(String[] args) {
		
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(new NewsType(1, "��ġ"));
		session.save(new NewsType(2, "����"));
		
		session.getTransaction().commit();
		
		
		session.close();
	}

}
