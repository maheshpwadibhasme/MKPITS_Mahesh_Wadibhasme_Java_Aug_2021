//wap to accept length , breadth and height and print volume
//(volume = lenght * breadth * height)
import java.util.*;
class Volume17{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter the length:-");
		 double l=scan.nextDouble();

		 System.out.println("Enter the breadth:-");
		 double b=scan.nextDouble();

		 System.out.println("Enter the height:-");
		 double h=scan.nextDouble();

		 double v = l*b*h;

		 System.out.println("Volume :- " +v);
	}
}