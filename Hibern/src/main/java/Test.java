import terela.com.dao.BusDAO;
import terela.com.dao.BusDAOImpl;
import terela.com.model.Bus;

import java.sql.SQLException;

/**
 * Created by java-2-06 on 26.02.2017.
 */
public class Test {
    private static BusDAO busDAO = new BusDAOImpl();

    public static void main(String[] args) {
        try {
//            List<Bus> buses = busDAO.getAllBusses();
//            for (int i = 0; i < buses.size(); i++) {
//                System.out.println(buses);
//            }
//
//            Bus bus = busDAO.getBusById(1L);
//            System.out.println(bus);

            // add Buss
            Bus busForAdd = new Bus();
            busForAdd.setNumber("433");
            busDAO.addBus(busForAdd);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
