import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket ss= new ServerSocket(5420);
            System.out.println("Waiting for Client Connection...");
            Socket s=ss.accept();
            System.out.println("Client is connected !");
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Client..");
            dos.flush();
            dos.close();
            ss.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
