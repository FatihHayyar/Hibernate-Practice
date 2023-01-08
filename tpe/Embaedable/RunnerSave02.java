package tpe.Embaedable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave02 {
    public static void main(String[] args) {
Education education=new Education("Karaelmas","Matematik");
Education education2=new Education("Karaelmas","Formasyon");
Education education3=new Education("Techpro","IT");

Developer02 developer=new Developer02(101L,"fatih","fthgmail","mat",education);
Developer02 developer1=new Developer02(102L,"numan","nmngmail","beckend",education2);
Developer02 developer2=new Developer02(103L,"ozcan","ozcngmail","frontend",education3);
Developer02 developer3=new Developer02(104L,"Gulus","glsgmail","isletme",education3);



        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer02.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        session.save(developer1);
        session.save(developer2);
        session.save(developer);
        session.save(developer3);

        tx.commit();
        session.close();
        sf.close();



    }



}
