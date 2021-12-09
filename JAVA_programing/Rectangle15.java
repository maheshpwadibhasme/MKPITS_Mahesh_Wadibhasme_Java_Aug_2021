//wap to accept lenght and breadth of a rectangle and then
//print area of rectange (area=length * breadth)
import java.util.*;
class Rectangle15{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter The Length:- ");
		float length=scan.nextFloat();

		System.out.print("Enter The Breadth:- ");
		float breadth=scan.nextFloat();

		float area=length*breadth;
		System.out.println("Area Of Rectangle:-" +area);

	}
}