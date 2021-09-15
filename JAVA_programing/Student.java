//wap to accept rno , name and address and then display it.
import java.util.*;
class Student{
		public static void main(String[] args){
			int rno;
			String name;
			String address;
			Scanner scan=new Scanner(System.in);

			System.out.print("Enter roll no. =");
			rno=scan.nextInt();

			System.out.print("Enter name =");
			name=scan.next();

			System.out.print("Enter address =");
			address=scan.next();

			System.out.println("---------------------------------");
			System.out.println("roll no. ="+rno);
			System.out.println("name ="+name);
			System.out.println("address ="+address);
			System.out.println("__________________________________");
			}
	}