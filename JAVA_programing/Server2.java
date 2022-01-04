import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Waiting for Client Connection..");
            Socket s= ss.accept();
            System.out.println("Client Connected !");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("Message:- "+str);
            ss.close();
        }
        catch(Exception ee){
            System.out.println(ee);
        }
    }
}
