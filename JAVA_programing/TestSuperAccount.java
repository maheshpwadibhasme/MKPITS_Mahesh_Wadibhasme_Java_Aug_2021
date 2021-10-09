//create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 3 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method.
class Account{
	int accNo;
	int balance;

	Account(int accNo,int balance){
		this.accNo=accNo;
		this.balance=balance;
	}
}
class Saving extends Account{
	int interest;
	Saving(int accNo,int balance,int interest){
		super(accNo,balance);
		this.interest=interest;
	}
	void displayData(){
		System.out.println(accNo+" "+balance+" "+interest);
	}
	void deposit(int amount){
		balance=balance+amount+interest;
		System.out.println("Amount deposited successfully in your account.");
	}
	void withdrawl(int amount){
		if(amount>balance){
			System.out.println("Due yo insufficient Balance in your account,amount was not withdrawl.");
		}else{
			balance=balance-amount;
			System.out.println(amount+"Amount was withdrawl.");
		}
	}
	void showBalance(){
		System.out.println("Balance in your account is :- "+balance);
	}
}
class TestSuperAccount{
	public static void main(String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("-------Saving Account Details are------");

		System.out.println("Enter a Account No. :- ");
		int accNo=scan.nextInt();

		System.out.println("Enter a Balance in your Account :- ");
		int balance=scan.nextInt();

		System.out.println("Enter a Amount to be deposited :- ");
		int amount=scan.nextInt();

		System.out.println("Enter a Interest on Saving Account :- ");
		int interest=scan.nextInt();

		System.out.println("Enter a Amount to be withdrawl :- ");
		amount=scan.nextInt();

		Saving s=new Saving(accNo,balance,interest);//calling saving class constructor
		s.deposit(amount);
		s.showBalance();

		s.withdrawl(amount);
		s.showBalance();
	}
}