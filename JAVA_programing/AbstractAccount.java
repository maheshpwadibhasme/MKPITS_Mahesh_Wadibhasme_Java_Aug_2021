abstract class Account {
	int actno;
	int bal=1000;
	abstract String deposit(int actno,int amt);//method without body.

	String withdrawl(int actno,int amt){
		this.actno=actno;
		if(amt > bal){
			return "Insufficient balance";
		}else{
			bal=bal-amt;
			return"Ammount withdrawl in account no :-"+actno+" balance is:- "+bal;
		}
	}
}
class Saving extends Account{
	String deposit(int actno,int amt){
		this.actno=actno;
		int interest=500;
		bal=bal+amt+interest;
		return"Ammount Deposited in Saving account no :-"+actno+" balance is:- "+bal;
	}
}
class Current extends Account{
	String deposit(int actno,int amt){
		this.actno=actno;
		bal=bal+amt;
		return "Ammount Deposited in Current account no :-"+actno+" balance is:- "+bal;
	}
}
class AbstractAccount{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Account No.-");
		int actno=scan.nextInt();
		System.out.println("Enter Amount :-");
		int amt=scan.nextInt();
		System.out.println("Enter type of account saving or current :-");
		String acttype=scan.next();
		System.out.println("Do you want to deposit or withdrawl :-");
		String ans=scan.next();
		Account act=null;
		String str;
		if (acttype.equals("saving")){
			act=new Saving();
		}else if(acttype.equals("current")){
			act=new Current();
		}else{
			System.out.println("Invalid account type..");
		}
		if(ans.equals("deposit")){
			str=act.deposit(actno,amt);
			System.out.println(str);
		}else if(ans.equals("withdrawl")){
			str=act.withdrawl(actno,amt);
			System.out.println(str);
		}else{
			System.out.println("Invalid input please check it again");
		}

	}
}