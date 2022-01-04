import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6300);
            System.out.println("waiting for client to connected");
            Socket s=ss.accept();
            System.out.println(" client  connected");
           // System.out.println("Waiting for client...");
            ss.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
