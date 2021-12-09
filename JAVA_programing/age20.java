//wap to accept age and print whether he is elegible to vote or not
import java.util.*;
class age20{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age :- ");
		int age=scan.nextInt();

		if(age<18){
			System.out.println("not elegible to vote");
		}
		 else{
			 System.out.println("elegible to vote");
		}
	}
}