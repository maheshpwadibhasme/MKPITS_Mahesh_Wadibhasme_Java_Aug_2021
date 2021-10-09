//create a class employee having empno,empname,designation and salary
class Employee {
	int empno;
	String empname;
	String empdesig;
	double empsalary;

	public void insertEmployeeData(int eno,String en,String ed,double es){
		empno=eno;
		empname=en;
		empdesig=ed;
		empsalary=es;
	}
	public void displayEmployeeData(){
		System.out.println("Employee No:-"+empno);
		System.out.println("Employee name:-"+empname);
		System.out.println("Employee Designation:-"+empdesig);
		System.out.println("Employee Salary:- "+empsalary);
	}
}
class TestEmployeeMethod{
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.insertEmployeeData(12,"mahesh","Engineer",500000);
		emp.displayEmployeeData();
	}
}