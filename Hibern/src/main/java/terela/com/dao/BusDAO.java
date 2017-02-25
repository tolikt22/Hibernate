package terela.com.dao;

import terela.com.model.Bus;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by java-2-06 on 26.02.2017.
 */

public interface BusDAO {
    void addBus(Bus bus) throws SQLException;
    void updateBus(Bus bus) throws SQLException;
    Bus getBusById(Long bus_id) throws SQLException;
    List<Bus> getAllBusses() throws SQLException;
}


