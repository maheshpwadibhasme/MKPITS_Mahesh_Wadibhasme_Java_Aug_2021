//example of employee class with constructor and method

class EmployeeDC2{
	int id;
	String name;

	EmployeeDC2(){
		id=2;
		name="mahesh";
	}
	public void display(){
		System.out.println("ID:- "+id);
		System.out.println("Name:- "+name);
	}
	public static void main(String[] args){
		EmployeeDC2 obj=new EmployeeDC2();
		obj.display();
	}
}