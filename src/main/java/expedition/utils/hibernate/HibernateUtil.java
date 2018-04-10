package expedition.utils.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure(
                            new File("C:\\Users\\chris\\IdeaProjects\\expedition-manager\\src\\main\\java\\hibernate.cfg.xml"))
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError("Blad polaczenia!");
        }
    }

    public static Session openSession() throws Exception {
        Session session;
        try {
            session = sessionFactory.openSession();
        } catch (Exception e) {
            throw new Exception("Blad polaczenia z baza danych!");
        }
        return session;
    }
}
