import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Bike extends Driver{
    private String strhandle;

    public String getStrhandle() {
        return strhandle;
    }

    public void setStrhandle(String strhandle) {
        this.strhandle = strhandle;
    }
}
