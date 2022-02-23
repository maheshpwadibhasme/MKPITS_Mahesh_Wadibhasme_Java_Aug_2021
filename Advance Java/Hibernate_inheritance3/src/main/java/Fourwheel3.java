import javax.persistence.Entity;

@Entity
public class Fourwheel3 extends Vehicle3{
    private String stwheel;

    public String getStwheel() {
        return stwheel;
    }

    public void setStwheel(String stwheel) {
        this.stwheel = stwheel;
    }
}
