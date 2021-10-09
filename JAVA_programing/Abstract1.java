abstract class Account{
	abstract void deposit();//method without body
	void withdrawl(){
		// method with body
		System.out.println("withdrawl method");
	}
}
class Saving extends Account {
	void deposit(){
		System.out.println("Deposit from Saving class");
	}
}
class Abstract1 {
	public static void main(String[] args){
		Account act=null;
		act=new Saving();
		act.deposit();
	}
}