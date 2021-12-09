//wap to accept a 2 number and print multiplication of 2 no.
import java.util.*;
class Multi14{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:- ");
		int num1=scan.nextInt();

		System.out.print("Enter Number:- ");
		int num2=scan.nextInt();

		int num=num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+":- "+num);
	}
}