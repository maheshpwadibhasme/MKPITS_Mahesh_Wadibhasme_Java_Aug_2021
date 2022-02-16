import javax.persistence.*;

@Entity
public class Emp2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name2;
    private String email2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "pin2",column =@Column(name = "home_pin")),
            @AttributeOverride(name = "city2",column =@Column(name = "home_city")),
            @AttributeOverride(name = "state2",column =@Column(name = "home_state"))
    })
    private Address2 home_adr2;

    @Embedded
    private Address2 office_adr2;

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

    public Address2 getHome_adr2() {
        return home_adr2;
    }

    public void setHome_adr2(Address2 home_adr2) {
        this.home_adr2 = home_adr2;
    }

    public Address2 getOffice_adr2() {
        return office_adr2;
    }

    public void setOffice_adr2(Address2 office_adr2) {
        this.office_adr2 = office_adr2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
