package hibernate_test;


import hibernate_test.entity.Emploeyy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Emploeyy.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Emploeyy emp = new Emploeyy("Elena", "Ivanova", "HR", 750);
        session.save(emp);
        session.getTransaction().commit();

        int myId = emp.getId();
        session = factory.getCurrentSession();
        session.beginTransaction();
        Emploeyy emploeyy = session.get(Emploeyy.class, myId);
        session.getTransaction().commit();
        System.out.println(emploeyy.toString());


    }
}
