//wap to accept to length , breadth, height and then print volume
import java.util.*;
class Volume
{
	public static void main(String[]args)
	{
		int length,breadth,height;
		float volume;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter length = ");
		length=scan.nextInt();

		System.out.println("Enter breadth = ");
		breadth=scan.nextInt();

		System.out.println("Enter height = ");
		height=scan.nextInt();

		volume=length*breadth*height;
		System.out.println("volume = " +volume);
	}
}