//Let's see the simple example to read data of file using BufferedInputStream:
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferedInputStreamExample2{
	public static void main(String[] args){
		try{
			FileInputStream fin=new FileInputStream("e:\\testout.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i=0;
			while((i=bin.read())!=-1){
				System.out.println((char)i);
			}
			bin.close();
			fin.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}