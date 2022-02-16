import javax.persistence.Embeddable;

@Embeddable
public class Address5 {
    private int pin2;
    private String city2;
    private String state2;

    public int getPin2() {
        return pin2;
    }

    public void setPin2(int pin2) {
        this.pin2 = pin2;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    @Override
    public String toString() {
        return "Address5{" +
                "pin2=" + pin2 +
                ", city2='" + city2 +city2+
                ", state2='" + state2 +state2+
                '}';
    }
}
