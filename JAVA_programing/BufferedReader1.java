//Java BufferedReader Class
import java.io.*;
public class BufferedReader1{
	public static void main(String[] args){
		try{
			FileReader fr=new FileReader("e:\\a.txt");
			BufferedReader br=new BufferedReader(fr);

			int i=0;

			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
			br.close();
			fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
}