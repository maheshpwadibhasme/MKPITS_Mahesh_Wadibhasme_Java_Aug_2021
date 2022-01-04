import java.io.DataOutputStream;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",5000);
            System.out.println("Done");
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server");
            dos.flush();
            dos.close();
            s.close();
        }catch (Exception ee){
            System.out.println(ee);
        }
    }
}
