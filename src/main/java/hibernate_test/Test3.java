package hibernate_test;


import hibernate_test.entity.Emploeyy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Emploeyy.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Emploeyy> emploeyyList = session.createQuery("from Emploeyy").getResultList();
        for (Emploeyy empl:emploeyyList) {
            System.out.println(empl.toString());
        }

        session.getTransaction().commit();
        System.out.println();


    }
}
