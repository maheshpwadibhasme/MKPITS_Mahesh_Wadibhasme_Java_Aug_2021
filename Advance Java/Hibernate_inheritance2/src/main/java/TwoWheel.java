import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "Twow")
public class TwoWheel extends Vehicle2{
    private String sthandle;

    public String getSthandle() {
        return sthandle;
    }

    public void setSthandle(String sthandle) {
        this.sthandle = sthandle;
    }
}
