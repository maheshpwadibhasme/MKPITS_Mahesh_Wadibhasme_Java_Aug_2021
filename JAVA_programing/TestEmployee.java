import mkpits1.Employee;
import java.util.*;
class TestEmployee{
	public static void main(String[] args){
	Employee r1=new Employee();
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Employee No. =");
	int empno=scan.nextInt();
	
	System.out.println("Emter Employee Name =");	
	String empname=scan.next();

	System.out.println("Enter Employee Basic Salary =");
	int basicsalary=scan.nextInt();

	r1.insert(empno,empname,basicsalary);
	r1.calculateBonus();
	r1.calculateTotalSalary();
	r1.display();
	}
}