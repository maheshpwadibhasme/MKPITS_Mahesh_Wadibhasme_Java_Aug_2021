import javax.persistence.*;

@Entity
public class emp01 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Name2;
    private String email2;

    @Embedded
    private Addres01 Aob;

    public String getName2() {
        return Name2;
    }

    public void setName2(String name2) {
        Name2 = name2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Addres01 getAob() {
        return Aob;
    }

    public void setAob(Addres01 aob) {
        Aob = aob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
