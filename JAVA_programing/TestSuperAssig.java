//create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 3 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method.
import java.util.*;
class Account{
	long account_no;
	float balance;

	Account(long account_no,float balance){
		this.account_no=account_no;
		this.balance=balance;
	}
	void display(){
		System.out.println("Account No. = "+account_no);
		System.out.println("Balance = "+balance);
	}
}
class Saving extends Account{
	float intrest=0.10f;
	float diposit;
	float withdrawl;
	float totalbalance;

	Saving(long account_no,float balance,float intrest,float diposit,float withdrawl){
		super(account_no,balance);
		this.intrest=intrest;
		this.diposit=diposit;
		this.withdrawl=withdrawl;


	}
	void display(){
		super.display();

	}
	void diposit(){
			totalbalance=balance+diposit;
			System.out.println("Diposit ="+diposit);
			System.out.println("Total balance is ="+totalbalance);
	}
	void withdrawl(){
		totalbalance=totalbalance-withdrawl;
		System.out.println("withdrawl="+withdrawl);
		System.out.println("Total balance is ="+totalbalance);
	}
}
class TestSuperAssig{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Account No.= ");
	long account_no=scan.nextLong();
	System.out.println("Enter Balance = ");
	float balance=scan.nextFloat();
	System.out.println("Enter Balance Diposit = ");
	float diposit=scan.nextFloat();
	System.out.println("Enter Balance Withdrawl = ");
	float withdrawl=scan.nextFloat();

		Saving s=new Saving(account_no,balance,0.10f,diposit,withdrawl);
		s.display();
		s.diposit();
		s.withdrawl();

	}
}
