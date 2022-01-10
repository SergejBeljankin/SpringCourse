package hibernate_test;


import hibernate_test.entity.Emploeyy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Emploeyy.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.createQuery("delete Emploeyy").executeUpdate();

        session.getTransaction().commit();
        System.out.println();


    }
}
