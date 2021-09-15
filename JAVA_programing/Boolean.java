//example of boolean data type
import java.util.*;
class Boolean{
	public static void main(String[] args){
		boolean b=false;
		System.out.println("b ="+b);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter true or false");
		b=scan.nextBoolean();
		System.out.println("boolean value ="+b);
	}
}