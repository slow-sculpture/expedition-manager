package expedition.team;

import expedition.utils.hibernate.HibernateUtil;
import org.hibernate.Session;

public class TeamRepo {
    public static void save(Team team) {
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.getTransaction().begin();
            session.saveOrUpdate(team);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
