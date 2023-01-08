package Spor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OgrenciYollama {
    public static void  ogrencileriYolla(Student student){
        Configuration conf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf=conf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction txf=session.beginTransaction();

        session.save(student);

        txf.commit();
        session.close();
        sf.close();
    }
}
