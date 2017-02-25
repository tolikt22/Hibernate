package terela.com.model;

import java.util.Set;

/**
 * Created by java-2-06 on 26.02.2017.
 */
public class Route {
    private Long id;
    private String name;
    private Integer number;
    private Set<Bus> buses;

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
