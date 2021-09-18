class Employee{
	int empno;
	String name;

	public Employee(){
		empno=123;
		name="mahesh";
	}
}
class Test{
	public static void main(String[] arg){
		Employee emp=new Employee();
		System.out.println("Employee no. ="+emp.empno);
		System.out.println("Employee mane ="+emp.name);
	}
}