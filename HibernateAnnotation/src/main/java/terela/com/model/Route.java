package terela.com.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "route_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "route")
    private Set<Bus> buses = new HashSet();
}