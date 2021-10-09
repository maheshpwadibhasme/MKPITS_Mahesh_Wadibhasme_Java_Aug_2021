//Example of CharArrayReader Class:
//In this example, we are Read a  data from 4 files f1.txt, f2.txt, f3.txt and f4.txt.
import java.io.*;

public class CharArrayReader1{
	public static void main(String[] args){
		try{
			char[] ary={'m','a','h','e','s','h'};

			CharArrayReader car=new CharArrayReader(ary);
			int i=0;
			while((i=car.read())!=-1){
				char ch =(char)i;
				System.out.print(ch+":-");
				System.out.println(i);
			}
		}
		catch(Exception e){
				System.out.println(e);
		}
	}
}