package terela.com.model;

import java.util.Set;

/**
 * Created by java-2-06 on 26.02.2017.
 */
public class Bus {
    private Long id;
    private String number;
    private Set<Driver> drivers;

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
