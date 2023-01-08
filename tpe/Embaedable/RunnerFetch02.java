package tpe.Embaedable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tpe.Annotation.Developer01;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch02 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer02.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//        Developer02 dev=session.get(Developer02.class,101L);
//        System.out.println(dev);

//        String hql = "from Developer02";
//        List<Developer02> list = session.createQuery(hql, Developer02.class).getResultList();
//        for (Developer02 dev : list) {
//            System.out.println(dev);
//        }
        //id si 101 olani getirin
//        Developer02 dev=session.get(Developer02.class,101L);
//        System.out.println(dev);
//2- id=1 olan developerın sadece eğitim bilgilerini yazdırınız.
        Developer02 dev=session.get(Developer02.class,101L);
        System.out.println(dev.getEducation());


            tx.commit();
            session.close();
            sf.close();


    }
    }
