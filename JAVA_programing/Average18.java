//wap to accept 3 number and print total and average.
import java.util.*;
class Average18{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter no:- ");
		int num1=scan.nextInt();

		System.out.print("Enter no:- ");
		int num2=scan.nextInt();

		System.out.print("Enter no:- ");
		int num3=scan.nextInt();

		int total=num1+num2+num3;
		System.out.println("Total:- "+total);

		float avg=(total/3);
		System.out.println("Average:- "+avg);
	}
}