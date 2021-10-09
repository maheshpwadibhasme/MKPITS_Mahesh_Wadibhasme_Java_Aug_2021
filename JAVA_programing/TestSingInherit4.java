//create a person class and then create a child class customer having fields custno,gstno.
class Person{
	String name;
	String address;
	void insertPersonData(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayPersonData(){
		System.out.println("Name ="+name);
		System.out.println("Address ="+address);
	}
}
class Customer extends Person{
	int custno;
	long mobno;
	String email;
	void insertCustomerData(int custno,long mobno,String email){
		this.custno=custno;
		this.mobno=mobno;
		this.email=email;
	}
	void displayCustomerData(){
		System.out.println("Customer no. ="+custno);
		System.out.println("Customer Mobile No. ="+mobno);
		System.out.println("Customer Email ="+email);
	}
}
class TestSingInherit4{
	public static void main(String[] args){
	Customer c=new Customer();
	c.insertPersonData("Mahesh","Bhojapur");
	c.insertCustomerData(1,7050956148l,"maheshpw@gmail.com");
	c.displayPersonData();
	c.displayCustomerData();
	}
}