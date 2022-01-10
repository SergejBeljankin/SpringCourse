package hibernate_test2;



import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Emploeyy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Emploeyy.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Emploeyy emploeyy = new Emploeyy("Zaur", "Tregulov", "IT", 500);
        Detail detail = new Detail("Baky", "123456", "zaur_tregulov@gmail.com");
        emploeyy.setEmpDetail(detail);
        session.beginTransaction();
        session.save(emploeyy);
        session.save(detail);
        session.getTransaction().commit();


    }
}
