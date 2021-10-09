//In this example, Employee has an object of Address, address object contains its own informations
//such as city, state, country etc. In such case relationship is Employee HAS-A address.
class Address{
	String city,state,country;

	public Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Employee{
	int empid;
	String empname;
	long empmobno;
	Address add;
	Employee(int empid,String empname,long empmobno,Address add){
		this.empid=empid;
		this.empname=empname;
		this.empmobno=empmobno;
		this.add=add;
	}
	void display(){
		System.out.println("Employee Id ="+empid);
		System.out.println("Employee name ="+empname);
		System.out.println("Employee Mobile no.= "+empmobno);
		System.out.println("Employee city ="+add.city);
		System.out.println("Employee State ="+add.state);
		System.out.println("Employee Country ="+add.country);
	}
}
class TestAggrigation2{
	public static void main(String[] args){
		Address add=new Address("nagpur","maharastra","india");
		Employee e=new Employee(124,"mahesh",8574964152l,add);
		e.display();
	}
}