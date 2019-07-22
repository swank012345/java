package swank.rafi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Emp.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
        
        Transaction t=session.beginTransaction();    
       
        
        
        Emp e = new Emp();
        e.setId(10);
        e.setName("rafi");
        
        Regemp r = new Regemp();
        r.setBonus(1000);
        r.setSalary(10000);
        
        Conemp c = new Conemp();
        c.setDuration(10);
        c.setRate(20);
        
        session.save(e);
        session.save(r);
        session.save(c);
        
        t.commit();
        session.close();
        System.out.println("success");

    }
}
