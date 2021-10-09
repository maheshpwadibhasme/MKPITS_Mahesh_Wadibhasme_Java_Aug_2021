//Java FileOutputStream Example 1: write byte
import java.io.FileOutputStream;
public class FileOutputStream{
	public static void main(String[] args){
		try{
			FileOutputStream fout=new FileOutputStream("e://testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		}
		catch(exception e){
			System.out.println(e);
		}
	}
}