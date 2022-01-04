import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6300);
            System.out.println("done");
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
