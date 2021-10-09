//In this example, we are writing the data of two files testout.txt and testout1.txt into
//another file named testout.txt.

import java.io.FileInputStream ;
import java.io.FileOutputStream  ;
import java.io.SequenceInputStream ;
class SeqInStrExample2{
	public static void main(String[] args)throws Exception{
		FileInputStream fin1=new FileInputStream("E:\\testout.txt");
		FileInputStream fin2=new FileInputStream("E:\\testout1.txt");
		FileOutputStream fout=new FileOutputStream("E:\\testoutresult.txt");
		SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sin.read())!=-1){
			fout.write(i);
		}
		sin.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");
	}
}
