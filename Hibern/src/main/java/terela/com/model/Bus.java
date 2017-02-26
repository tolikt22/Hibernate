package terela.com.model;

import java.util.Set;

/**
 * Created by java-2-06 on 26.02.2017.
 */
public class Bus {
    private Long id;
    private int number;
    private Set<Driver> drivers;
    private Long route_id;

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
