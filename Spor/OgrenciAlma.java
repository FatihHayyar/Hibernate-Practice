package Spor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OgrenciAlma {

    public static List<Student> ogrenciAl() {
        Configuration conf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txf = session.beginTransaction();
        String hql = "from Student";
        List<Student> mylist = session.createQuery(hql, Student.class).getResultList();

        txf.commit();
        session.close();
        sf.close();
        return mylist;
    }
}
