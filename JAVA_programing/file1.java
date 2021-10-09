//wap to accept your name and write this name in a file
import java.io.FileOutputStream;
import java.util.*;
class file1{
	public static void main(String[] args){
		try{
			FileOutputStream f=new FileOutputStream("e:\\java_i_o\\file1.txt");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name ");
			String str=" name ";

			str +=scan.nextLine();

			byte[] arr=str.getBytes();
			f.write(arr);
			f.close();
			System.out.println("data written to file successfully...");
		}
		catch (Exception ee){
			System.out.println(ee.toString());
		}
	}
}