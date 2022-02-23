import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "fourw")
public class FourWheel extends Vehicle2{
    private String stwheel;

    public String getStwheel() {
        return stwheel;
    }

    public void setStwheel(String stwheel) {
        this.stwheel = stwheel;
    }
}
