//example of employee class with constructor and method
class Employee{
	int empno;
	String name;

	public Employee(){
		System.out.println("default constructor called");
		empno=90;
		name="mahesh";
		}

		//creating method display
		public void display(){
			System.out.println("Employee no. ="+empno);
			System.out.println("Employee name ="+name);
			}
}
class Test1{
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.display();
		}
}