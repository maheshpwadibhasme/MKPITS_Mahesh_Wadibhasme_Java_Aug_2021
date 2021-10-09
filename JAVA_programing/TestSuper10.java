//Let's see the real use of super keyword. Here, Emp class inherits Person class so all the properties
//of Person will be inherited to Emp by default. To initialize all the property,
//we are using parent class constructor from child class. In such way, we are reusing the parent class constructor.
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person{
	float salary;
	Emp(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	void display(){
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
}
class TestSuper10{
	public static void main(String[] args){
		Emp e=new Emp(154,"mahesh",50000);
		e.display();
	}
}