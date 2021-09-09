//- wap to accept 3 subject marks and then print total mark
import java.util.*;
class Marks
{
	public static void main(String[]args)
	{
		int s1,s2,s3,total;

		Scanner scan= new Scanner(System.in);

		System.out.println("Enter subject 1 marks = ");
		s1=scan.nextInt();

		System.out.println("Enter subject 2 marks = ");
		s2=scan.nextInt();

		System.out.println("Enter subject 3 marks = ");
		s3=scan.nextInt();

		total=s1+s2+s3;
		System.out.println("total marks in 3 subjects = " + total);
	}
}