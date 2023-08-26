package weather;

import static spark.Spark.*;
import static spark.Spark.modelAndView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	
	private static Crawling crawling = new Crawling();
	private static SessionFactory sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	
	public void insertWeather(List<Weather> a) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for(Weather weather : a) {
				
				session.save(weather);
				System.out.println(weather);
		}
		
		session.getTransaction().commit();
		System.out.println("종료 되었습니다.");
	}

	public List<Weather> getAll( ){
		Session session = sessionFactory.openSession();
		try {
			List<Weather> list = session.createQuery("FROM Weather", Weather.class).list();
			
			return list;
		} catch (HibernateException e) {
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		
		
		return null;
	}
	public static void main(String[] args) {
		Main a = new Main();

		port(8088);
		
        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("wa", a.getAll());
            attributes.put("wa1", "ㅎㅇ");

            return modelAndView(attributes, "hello.ftl");
        }, new FreeMarkerTemplateEngine());
	}


}
