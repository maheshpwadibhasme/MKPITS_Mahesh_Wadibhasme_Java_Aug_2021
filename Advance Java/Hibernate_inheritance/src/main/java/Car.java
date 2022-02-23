import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Car extends Driver{
    private String strwheel;

    public String getStrwheel() {
        return strwheel;
    }

    public void setStrwheel(String strwheel) {
        this.strwheel = strwheel;
    }
}
