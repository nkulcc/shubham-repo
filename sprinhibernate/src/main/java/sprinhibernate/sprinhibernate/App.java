package sprinhibernate.sprinhibernate;






import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
       Alien alien=new Alien();
       alien.setaName("AlienOne");
       alien.setaColor("Blue");
       alien.setaPlace("Moon");
       Session session = HibernateUtil.getSessionFactory().openSession();
       
       session.beginTransaction();
      
       session.save(alien);
       alien.setaColor("Red");
       session.saveOrUpdate(alien);
       session.getTransaction().commit();
//       
//       Session sessionGet = HibernateUtil.getSessionFactory().openSession();
//       sessionGet.beginTransaction();
//       alien=null;
//       alien=sessionGet.get(Alien.class, 1);
//       System.out.println(alien.toString());
//       sessionGet.getTransaction().commit();
//       
//       Session sessioMapp = HibernateUtil.getSessionFactory().openSession();
      // sessioMapp.beginTransaction();
       
//       laptop lap=new laptop();
//       lap.setLid(2);
//       lap.setLname("Lenovo");
//       sessioMapp.save(lap);
//       sessioMapp.getTransaction().commit();
//       Student s=new Student();
//       s.setRollNo(101);
//       s.setMarks(20);
//       s.setsName("Rahul");
//       s.setLaptop(lap);
//       
//       sessioMapp.beginTransaction();
//       sessioMapp.save(s);
//       sessioMapp.getTransaction().commit();
       
//       Student student =sessioMapp.get(Student.class, 101);
//       System.out.println(student.toString());
    	
//    	First Level Caching.
    //	Session session = HibernateUtil.getSessionFactory().openSession();
 //   	session.beginTransaction();
//    	Query level cahce
 //   	Query queryOne=session.createQuery("from Alien where aid=1");
    
//    	((org.hibernate.query.Query) queryOne).setCacheable(true);
//    	alien=(Alien) queryOne.uniqueResult();
    	
//    	System.out.println(session.get(Alien.class, 1));
    	
    	//Fire only once query
//    	System.out.println(session.get(Alien.class, 1));
    	//Fire second query
//    	System.out.println(session.get(Alien.class, 2));
//    	session.getTransaction().commit();
    	
    	
//    	Seond Level Cache using Ehcach dependeny
    	
//    	Session sessionsecond = HibernateUtil.getSessionFactory().openSession();
//    	sessionsecond.beginTransaction();
    	// Fire Query again because session is different 
   // 	Query querySecond=session.createQuery("from Alien where aid=1");
    	//((org.hibernate.query.Query) querySecond).setCacheable(true);
 //   	alien=(Alien) querySecond.uniqueResult();
//    	System.out.println(sessionsecond.get(Alien.class, 1));
    	
    	
    }
}
