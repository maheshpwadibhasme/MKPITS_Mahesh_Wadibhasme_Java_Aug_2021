import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User6_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String Uname;
    @ManyToMany(mappedBy = "uob")
    private Collection<Vehicle6_2> vob=new ArrayList<Vehicle6_2>();

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public Collection<Vehicle6_2> getVob() {
        return vob;
    }

    public void setVob(Collection<Vehicle6_2> vob) {
        this.vob = vob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
