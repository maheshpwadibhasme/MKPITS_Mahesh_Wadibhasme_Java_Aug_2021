//Java FileOutputStream example 2: write string

import java.io.FileOutputStream;
public class FileOutputStreamExample2{
		public static void main(String[] args){
				try{
					FileOutputStream fout=new FileOutputStream("E://java_i_o//string.txt");
						String s="mahesh";
						byte b[]=s.getBytes();
						fout.write(b);
						fout.close();
						System.out.println("success..,");
				}
				catch (Exception e){
						System.out.println(e);
				}
		}
}