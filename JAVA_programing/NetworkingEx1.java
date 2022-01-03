//name of device and IP address
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingEx1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress obj= InetAddress.getLocalHost();
        System.out.println(obj);
        System.out.println(obj.getHostAddress());
    }
}
