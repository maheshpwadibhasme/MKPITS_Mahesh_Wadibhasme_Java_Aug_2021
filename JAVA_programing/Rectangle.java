//wap to accept length and breadht of rectangle and then print area of rectangle.

import java .util.*;
class Rectangle
{
	public static void main(String[]args)
	{
	int length,breadth,area;

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter length = ");
	length=scan.nextInt();

	System.out.println("Enter breadth = ");
	breadth=scan.nextInt();

	area=length*breadth;
	System.out.println("area of rectangle = "+ area);
	}
}