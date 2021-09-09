//1-	wap to accept to accept 3 subject marks and then print total , percentage
import java.util.*;
class Subject
{
	public static void main(String[]args)
	{
		int s1,s2,s3,total;
		float per;
		Scanner scan=new Scanner(System.in);

		System.out.print("\n Enter subject 1 marks = ");
		s1=scan.nextInt();

		System.out.print("\n Enter subject 2 marks = ");
		s2=scan.nextInt();

		System.out.print("\n Enter subject 3 marks = ");
		s3=scan.nextInt();

		total=s1+s2+s3;
		System.out.println("\n total marks = "+total);

		per=(float)(total/300f)*100f;
		System.out.println("\n percentage = "+per);
	}
}