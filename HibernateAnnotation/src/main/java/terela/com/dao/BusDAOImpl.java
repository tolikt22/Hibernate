package terela.com.dao;

import org.hibernate.Session;
import terela.com.model.Bus;
import terela.com.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by java-2-06 on 26.02.2017.
 */
public class BusDAOImpl implements BusDAO {
    public void addBus(Bus bus) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(bus);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }

    public void updateBus(Bus bus) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(bus);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }


    public Bus getBusById(Long bus_id) throws SQLException {
        Session session = null;
        Bus bus = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bus = (Bus) session.get(Bus.class, bus_id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bus;
    }

    public List<Bus> getAllBusses() throws SQLException {
        Session session = null;
        List<Bus> busses = new ArrayList<Bus>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            busses = session.createCriteria(Bus.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return busses;
    }
}



