//Java ByteArrayInputStream Class

import java.io.*;
public class ByteArrayInputStream1{
	public static void main(String[] args){
		try{
			byte[] b={ 35, 36, 37, 38 };
			ByteArrayInputStream byt=new ByteArrayInputStream(b);
			int i=0;
			while((i=byt.read())!=-1){
				char ch=(char)i;
				System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}