//Short Data Type
import java.util.*;
class Short{
	public static void main(String[] args){
		short s=32767;
		System.out.println(s);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter short value = ");
		s=scan.nextShort();
		System.out.println("short value = "+s);
	}
}