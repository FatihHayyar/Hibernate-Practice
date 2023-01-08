package tpe.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tpe.Embaedable.Developer02;

public class RunnerFetch03 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer03.class).addAnnotatedClass(Computer.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //id=33 olan computerın tüm bilgilerini getiriniz.

//        Computer computer = session.get(Computer.class,33L);
//        System.out.println(computer);

        //id=22 olan computerı kullanan dev bilgilerini getiriniz.

        Computer computer = session.get(Computer.class,33L);
        System.out.println(computer.getDeveloper());

        tx.commit();
            session.close();
            sf.close();


    }
    }
