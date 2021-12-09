//wap to accept a number and print square of that number.
import java.util.*;
class Square12{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number:- ");
		int num=scan.nextInt();
		int num1=num*num;
		System.out.println("Square of " +num+ ":- "+num1);
	}
}