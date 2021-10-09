//A constructor is called "Default Constructor" when it doesn't have any parameter.
class EmployeeDC{
	int id;
	String name;
	String Addr;

	EmployeeDC(){
		id=1;
		name="mahesh";
		Addr="nagpur";
	}
	public static void main(String[] args){
		EmployeeDC obj=new EmployeeDC();
		System.out.println("Id:- "+obj.id);
		System.out.println("Name:- "+obj.name);
		System.out.println("Address:- "+obj.Addr);
	}
}