//wap to accept radius of a circle and print area and circ of circle.
//(area= 3.14 * radius * radius)
//(circ = 2 * 3.14 * radius)
import java.util.*;
class Circle16{

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);

		System.out.print("Enter Radius :-");
		double r =scan.nextDouble();

		double a = ( 3.14 * r * r);
		System.out.println("Area Of Circle:-" +a);

		double c= (2 * 3.14 * r);
		System.out.println("Circumferance of circle:-" +c);
	}
}