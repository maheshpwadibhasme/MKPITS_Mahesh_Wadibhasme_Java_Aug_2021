import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class emp4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name2;
    private String email2;

    @ElementCollection
            @JoinTable(name="empadr",joinColumns = @JoinColumn(name="eid"))
    Set<Address4> adr2=new HashSet<Address4>();

    public Set<Address4> getAdr2() {
        return adr2;
    }

    public void setAdr2(Set<Address4> adr2) {
        this.adr2 = adr2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
