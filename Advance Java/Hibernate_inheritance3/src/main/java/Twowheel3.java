import javax.persistence.Entity;

@Entity
public class Twowheel3 extends Vehicle3{
    private String sthandle;

    public String getSthandle() {
        return sthandle;
    }

    public void setSthandle(String sthandle) {
        this.sthandle = sthandle;
    }
}
