//Char Data Type
import java.util.*;
class Char{
	public static void main(String[] args){
		char n='A';
		System.out.println(n);
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter char = ");
		n=scan.next().charAt(0);
		System.out.println("char ="+n);
	}
}