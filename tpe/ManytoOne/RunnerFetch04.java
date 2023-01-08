package tpe.ManytoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tpe.OneToOne.Computer;
import tpe.OneToOne.Developer03;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch04 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer04.class).addAnnotatedClass(Company.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //1--id=2 olan developerın çalıştığı company bilgilerini getiriniz.

//        Developer04 dev=session.get(Developer04.class,2L);
//        System.out.println(dev.getCompany());

//2--tüm developerların ismini ve çalıştığı company ismini görüntüleyiniz.

//        String hql="from Developer04";
//        List<Developer04> lisst=session.createQuery(hql,Developer04.class).getResultList();
//lisst.forEach(t-> System.out.println(t.getName()+" "+t.getCompany().getCompanyname()));

//3--Googleda çalışan developerların ismini ve branchini görüntüleyiniz.***ÖDEV***

//        String hql="select d.name,d.branch from Developer04 d where d.company.companyname='Google'";
//List<Object[]> list=session.createQuery(hql).getResultList();
//list.forEach(t-> System.out.println(Arrays.toString(t)));

        String hql="from Company c where c.companyname='Google'";


        tx.commit();
            session.close();
            sf.close();


    }
    }
