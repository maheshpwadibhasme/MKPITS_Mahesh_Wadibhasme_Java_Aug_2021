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
		System.out.println("Balance for account no :-" +accno+ "  Balance is :- " +balance);
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
class TestHierachiInheriUser3 {
	public static void main(String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("-----------Saving Account Details are------------");
		Saving s=new Saving();

		System.out.print("Enter Account No. =");
		int accno=scan.nextInt();
		System.out.print("Enter balance =");
		int balance=scan.nextInt();
		s.insertAccountData(accno,balance);

		System.out.print("Enter Deposit Amount =");
		int amount=scan.nextInt();
		s.deposit(amount);
		s.showAccountData();

		System.out.println("-----------Current Account Details are------------");
		Current c=new Current();

		System.out.print("Enter Account No. =");
		accno=scan.nextInt();
		System.out.print("Enter balance =");
		balance=scan.nextInt();
		c.insertAccountData(accno,balance);

		System.out.print("Enter Deposit Amount =");
		amount=scan.nextInt();
		c.deposit(amount);
		c.showAccountData();
	}
}