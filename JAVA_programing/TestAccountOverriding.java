//ex : 3 create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.
class Account{
	long accno;
	int balance=1000;

	void deposit(int amount){
		System.out.println("deposit method of account class");
	}
	void withdrawl(int amount){
		System.out.println("withdrawl method of account class");
	}
}
class Saving extends Account{
	void deposit(int amount){
		balance=balance+amount;
		System.out.println("deposit method of saving class ,balance is " + balance);
	}
	void withdrawl(int amount){
		balance=balance-amount;
		System.out.println("withdrawl method of saving class ,balance is " + balance);
	}
}
class TestAccountOverriding{
	public static void main(String[] args){
		Saving s=new Saving();
		s.deposit(100);
		s.withdrawl(50);
	}
}