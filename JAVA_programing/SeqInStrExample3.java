//Let's see the simple example where we are reading the data from 4 files: a.txt, b.txt, c.txt and d.txt.
import java.io.*;
import java.util.*;
class  SeqInStrExample3{
	public static void main(String[] args){
		try{
			FileInputStream fin1=new FileInputStream("E:\\a.txt");
			FileInputStream fin2=new FileInputStream("E:\\b.txt");
			FileInputStream fin3=new FileInputStream("E:\\c.txt");
			FileInputStream fin4=new FileInputStream("E:\\d.txt");

			Vector v=new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			v.add(fin4);

			Enumeration e=v.elements();
			SequenceInputStream sin=new SequenceInputStream(e);
			int i=0;
			while((i=sin.read())!=-1){
				System.out.print((char)i);
			}
			sin.close();
			fin1.close();
			fin2.close();
			fin3.close();
			fin4.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}