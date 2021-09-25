//create a package mkpits1 and a class Employee having fields empno,empname, basicsalary
//create method insert , calculateBonus, display .
package mkpits1;
public class Employee{
	int empno;
	String empname;
	int basicsalary;
	float bonus;
	float totalsalary;

	public void insert(int e,String n,int s){
	empno=e;
	empname=n;
	basicsalary=s;
	
	}
	
	public void calculateBonus(){
	bonus=basicsalary*0.65f;
	}
	
	public void calculateTotalSalary(){
	totalsalary=basicsalary+bonus;
	}
	
	public void display(){
		System.out.println("Employee No. ="+empno);
		System.out.println("Employee Name ="+empname);
		System.out.println("Employee Basic Salary ="+basicsalary);
		System.out.println("Employee Bonus ="+bonus);
		System.out.println("Employee Total Salary ="+totalsalary);
	}
}