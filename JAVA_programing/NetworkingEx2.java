import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingEx2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress obj2= InetAddress.getLocalHost();
        System.out.println(obj2.getByName("www.whatsapp.com"));
        System.out.println(obj2.getLoopbackAddress());
        System.out.println(obj2.isAnyLocalAddress());
        System.out.println(obj2.isLinkLocalAddress());
        System.out.println(obj2.isLoopbackAddress());
    }
}
