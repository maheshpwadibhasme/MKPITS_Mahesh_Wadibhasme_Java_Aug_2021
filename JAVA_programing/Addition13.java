//wap to accept 2 no. and print addition of 2 no.
import java.util.*;
class Addition13{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int num1=scan.nextInt();

		System.out.print("Enter the number :- ");
		int num2=scan.nextInt();

		int num=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+":- "+num);
	}
}