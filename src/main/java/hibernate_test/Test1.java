package hibernate_test;


import hibernate_test.entity.Emploeyy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Emploeyy.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Emploeyy emp = new Emploeyy("Ivan", "Smirov", "Salary", 700);
        session.save(emp);
        session.getTransaction().commit();
        System.out.println(emp.getId());

    }
}
