import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Vehicle6_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String Vname;
    @ManyToMany
    private Collection<User6_2> uob=new ArrayList<User6_2>();

    public String getVname() {
        return Vname;
    }

    public void setVname(String vname) {
        Vname = vname;
    }

    public Collection<User6_2> getUob() {
        return uob;
    }

    public void setUob(Collection<User6_2> uob) {
        this.uob = uob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
