package terela.com.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by java-2-06 on 26.02.2017.
 */
@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "drivers")
    private Set<Bus> buses = new HashSet();
}
