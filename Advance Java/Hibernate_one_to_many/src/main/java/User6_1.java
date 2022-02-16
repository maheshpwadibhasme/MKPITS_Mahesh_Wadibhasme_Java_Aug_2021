import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User6_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Uname;

    @OneToMany(mappedBy ="ubo")
    private Collection<Vehicle6_1> veh=new ArrayList<>();

    public Collection<Vehicle6_1> getVeh() {
        return veh;
    }

    public void setVeh(Collection<Vehicle6_1> veh) {
        this.veh = veh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

}
