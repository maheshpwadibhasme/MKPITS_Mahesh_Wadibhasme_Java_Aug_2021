import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(5430);
        Socket s=ss.accept();

        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while (!str.equals("Stop")){
            str=dis.readUTF();
            System.out.println("Client say:- "+str);

            str2= br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }
        dos.close();
        s.close();
        ss.close();
    }
}
