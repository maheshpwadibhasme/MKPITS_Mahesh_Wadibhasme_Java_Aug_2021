//Java FileOutputStream example 2: write string

import java.io.FileOutputStream;
public class Java FileOutputStreamExample2{
		public static void main(String[] args){
				try{
					FileOutputStreamExample2 fout=new FileOutputStreamExample2("e://Stringout.txt");
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