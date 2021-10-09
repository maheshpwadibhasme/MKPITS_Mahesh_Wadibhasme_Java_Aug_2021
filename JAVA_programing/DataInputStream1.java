//Java DataInputStream Class
import java.io.*;
public class DataInputStream1{
	public static void main(String[] args)throws IOException{
		FileInputStream fin=new FileInputStream("e:\\testout.txt");
		DataInputStream din=new DataInputStream(fin);
		int count = fin.available();
		byte[] ary=new byte[count];

		din.read(ary);
		for(byte bt:ary){
			char k=(char)bt;
			System.out.println(k+"-");
		}
	}
}