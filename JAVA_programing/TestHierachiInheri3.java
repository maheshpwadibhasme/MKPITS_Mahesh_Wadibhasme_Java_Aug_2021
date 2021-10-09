//another example of hierarchical inheritance
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest
class Account {
	int accno;
	int balance;
	void insertAccountData(int accno,int balance){
		this.accno=accno;
		this.balance=balance;
	}
	void showAccountData(){
		System.out.println("Balance for account no " +accno+ " is " +balance);
	}
}
class Saving extends Account{
	void deposit(int amount){
		int interest=500;
		balance=balance+amount+interest;
		System.out.println("Amount Deposited in your Saving account is successfully");
	}
}
class Current extends Account{
	void deposit(int amount){
		balance=balance+amount;
		System.out.println("Amount Deposited in your Current account is successfully");
	}
}
class TestHierachiInheri3 {
	public static void main(String[] args){
		System.out.println("-----------Saving Account Details are------------");
		Saving s=new Saving();
		s.insertAccountData(123,1000);
		s.deposit(100);
		s.showAccountData();

		System.out.println("-----------Current Account Details are------------");
		Current c=new Current();
		c.insertAccountData(456,1000);
		c.deposit(100);
		c.showAccountData();
	}
}