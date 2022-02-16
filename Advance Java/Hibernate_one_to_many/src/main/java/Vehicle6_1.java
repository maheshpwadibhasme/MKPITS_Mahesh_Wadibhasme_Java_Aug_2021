import javax.persistence.*;

@Entity
public class Vehicle6_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Vname;

    @ManyToOne
    @JoinColumn(name ="usrid")
    private User6_1 ubo;

    public User6_1 getUbo() {
        return ubo;
    }

    public void setUbo(User6_1 ubo) {
        this.ubo = ubo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVname() {
        return Vname;
    }

    public void setVname(String vname) {
        Vname = vname;
    }
}
