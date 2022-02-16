import javax.persistence.*;

@Entity
public class User6 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Uname;

    @OneToOne
    private Vehicle6 veh;

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

    public Vehicle6 getVeh() {
        return veh;
    }

    public void setVeh(Vehicle6 veh) {
        this.veh = veh;
    }
}
