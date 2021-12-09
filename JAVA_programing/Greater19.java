//wap to accept 2 no. and print greater no.
import java.util.*;
class Greater19{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter number1 :- ");
		int n1=scan.nextInt();

		System.out.print("Enter number2 :- ");
		int n2=scan.nextInt();

		if(n1>n2){
			System.out.println("N1 is greater");
		}else{
			System.out.println("N2 is greater");
		}
	}
}