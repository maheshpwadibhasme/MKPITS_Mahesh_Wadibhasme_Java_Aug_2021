//2-	wap to accept empno , empname and salary and then print hra ,da, and total salary.
import java.util.*;
class Employee
{
	public static void main(String[] args)
	{
		int empno,salary;
		float totalsalary;
		String empname;
		Scanner scan=new Scanner(System.in);

		System.out.print("enter employee no. = ");
		empno=scan.nextInt();

		System.out.print("enter employee name = ");
		empname=scan.next();

		System.out.print("salary = ");
		salary=scan.nextInt();

		 float hra=0.35f*salary;
		System.out.print("\n hra = "+hra);

		float da= (0.45f*salary);
		System.out.print("\n da = "+da);

		totalsalary=hra +da + salary;
		System.out.println("\n total salary = "+ totalsalary);

	}
}