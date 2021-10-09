//create a class customer having custid,custname,custaddress,mobno,email.
class Customer{
	int custid;
	String custname;
	String custadd;
	long custmobno;
	String email;

	public void insertCustomerData(int cid,String cn,String ca,long cmn, String ce){
		custid=cid;
		custname=cn;
		custadd=ca;
		custmobno=cmn;
		email=ce;
	}
	public void displayCustomerData(){
		System.out.println("Customer Id:- "+custid);
		System.out.println("Customer Name:- "+custname);
		System.out.println("Customer Address:- "+custadd);
		System.out.println("Customer Mobile no:- "+custmobno);
		System.out.println("Customer email:- "+email);
	}
}
class TestCustomerMethod{
	public static void main(String[] args){
		Customer cust=new Customer();
		cust.insertCustomerData(12,"mahesh","nagpur",7485964152l,"maheshpw@gmail.com");
		cust.displayCustomerData();
	}
}