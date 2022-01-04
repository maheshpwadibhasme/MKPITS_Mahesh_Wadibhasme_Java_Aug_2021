import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) throws IOException {
        try{
            Socket s=new Socket("localhost",5420);
            System.out.println("Done");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("Message:- "+str);
            dis.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
