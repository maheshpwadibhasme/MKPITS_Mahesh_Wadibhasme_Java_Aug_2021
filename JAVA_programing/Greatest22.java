//wap to accept 3no. and print greatest no.
import java.util.*;
class Greatest22{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Three Number1:- ");
		int n1=scan.nextInt();

		System.out.println("Enter Three Number2:- ");
		int n2=scan.nextInt();

		System.out.println("Enter Three Number3:- ");
		int n3=scan.nextInt();

		if(n1>n3 && n1>n2){
			System.out.println("n1 is greater");
		} else if(n2>n3){
			System.out.println("n2 is greater");
		}else{
			System.out.println("n3 is greater");
		}

	}
}