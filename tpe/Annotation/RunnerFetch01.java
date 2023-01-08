package tpe.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RunnerFetch01 {
    public static void main(String[] args) {


    Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer01.class);
    SessionFactory sf=con.buildSessionFactory();
    Session session=sf.openSession();
    Transaction tx=session.beginTransaction();

        //1.yol
//        Developer01 dev1=session.get(Developer01.class,1);
//        System.out.println(dev1);
    //2.yol
//        String sql="select * from t_developer";
//        List<Object[]> mylist=session.createSQLQuery(sql).getResultList();
//        for (Object[] dev:mylist){
//        System.out.println(Arrays.toString(dev));
//}
//3.yol
//        String hql="from Developer01";
//        List<Developer01> list=session.createQuery(hql, Developer01.class).getResultList();
//        for (Developer01 dev:list){
//            System.out.println(dev);
//        }

//extra id si 2 olan gelsin

//        String hql="from Developer01 where id=1";
//        Developer01 dev=session.createQuery(hql, Developer01.class).uniqueResult();
//        System.out.println(dev);

        //extra isim ve bransi getir
        String hql="select name,branch from Developer01 ";
        List<Object[]> list = session.createQuery(hql).getResultList();
        for(Object[] dev:list){
            System.out.println(Arrays.toString(dev));
        }


        tx.commit();
        session.close();
        sf.close();
}
}