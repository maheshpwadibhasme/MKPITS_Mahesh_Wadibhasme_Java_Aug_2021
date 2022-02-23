import javax.persistence.*;

@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name ="Vehicle_type",discriminatorType = DiscriminatorType.STRING)
public class Vehicle2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vid", nullable = false)
    private Integer vid;
    private String vname;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}
