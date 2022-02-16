import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int pincode2;
    private String city2;
    private String state2;

    public int getPincode2() {
        return pincode2;
    }

    public void setPincode2(int pincode2) {
        this.pincode2 = pincode2;
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
}
