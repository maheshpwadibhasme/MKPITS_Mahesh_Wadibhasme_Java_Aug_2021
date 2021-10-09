//example of runtime polymorphism using account, saving and current class
class Account{
	int actno;
	int bal=1000;

	String deposit(int actno,int amt){
		return"Account class deposit method ";
	}
	String withdrawl(int actno,int amt){
		this.actno=actno;
		if(amt > bal){
			return"Insufficient Balance";
		}
		else{
			bal=bal-amt;
			return"Account class withdrawl method Account no:- "+actno+" Balance is:- "+bal;
		}
	}
}
class Saving extends Account{
	int interest=500;
	String deposit(int actno,int amt){
		this.actno=actno;
		bal=bal+amt+interest;
		return"Account deposited for Account no:- "+actno+" Balance is:- "+bal;
	}
}
class Current extends Account{
	String deposit(int actno,int amt){
		this.actno=actno;
		bal=bal+amt;
		return"Account deposited for Account no:- "+actno+" Balance is:- "+bal;
	}
}
class RunTimePolymorphism2{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("Enter Account No:-");
	int actno=scan.nextInt();

	System.out.println("Enter Amount:- ");
	int amt=scan.nextInt();

	System.out.println("Enter Account Type Saving or Current :- ");
	String acttype=scan.next();

	System.out.println("Do you want to deposit or withdrawl :- ");
	String ans=scan.next();

	Account act=null;
	String str;

		if(acttype.equals("saving")){
			act= new Saving();
		}
		else if(acttype.equals("current")){
			act=new Current();
		}
		else{
			System.out.println("Invalid account type..");
		}
		if(ans.equals("deposit")){
			str=act.deposit(actno,amt);
			System.out.println(str);
		}
		else if(ans.equals("withdrawl")){
			str=act.withdrawl(actno,amt);
			System.out.println(str);
		}
	}
}