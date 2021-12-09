// wap to accept age and print whether he is minor, young or old
import java.util.*;
class age21{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter age:- ");
		int age = scan.nextInt();

		if(age<18){
			System.out.println("he is minor");
		}
		else if(age>=18 && age<65){
			System.out.println("he is young");
		}
		else{
			System.out.println("he is old");
		}
	}
}