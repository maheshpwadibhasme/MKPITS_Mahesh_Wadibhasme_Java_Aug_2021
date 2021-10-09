//ex 4 create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving inherited from account class and override the deposit(with interest) and withdrawl method.
//create a subclass current  inherited from account  and override the deposit(without interest) and withdrawl method
class Account {
	int actno;
	int bal=1000;
	String deposit(int actno,int amt){
		return "Account class deposit method";
	}
	String withdrawl(int actno,int amt){
		this.actno=actno;
		if (amt > bal){
			return "Insufficient balance";
		}else {
			bal=bal-amt;
			return "Account withdrawl for account no:-"+actno+" balance:- "+bal;
		}
	}
}
class Saving extends Account{
	int interest=500;
	String deposit(int actno,int amt){
		this.actno=actno;
		bal=bal+amt+interest;
		return "Account deposited for acct no:-" +actno+ " balance:- "+bal;
	}
}
class current extends Account {
	String deposit(int actno,int amt){
		this.actno=actno;
		bal=bal+amt;
		return "Account deposited for acct no:- " +actno+ " balance:-"+bal;
	}
}
public class TestAccountSCOverriding{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);

	System.out.println("Enter Account No.-");
	int actno=scan.nextInt();

	System.out.println("Enter Amount :-");
	int amt=scan.nextInt();

	System.out.println("Enter Type Of Account Saving or Current :-");
	String acttype=scan.next();

	System.out.println("Do You Want TO Deposit Or Withdrawl :-");
	String ans=scan.next();

	Saving sav=null;
	current cur=null;

	String str;

	if (acttype.equals("saving")){
			sav=new Saving();
			if(ans.equals("deposit")){
				str=sav.deposit(actno,amt);
				System.out.println(str);
			}else if(ans.equals("withdrawl")){
				str=sav.withdrawl(actno,amt);
				System.out.println(str);
				}
		}
	if(acttype.equals("current")){
		cur=new current();
		if(ans.equals("deposit")){
			str=cur.deposit(actno,amt);
			System.out.println(str);
		}else if(ans.equals("withdrawl")){
			str=cur.withdrawl(actno,amt);
			System.out.println(str);
			}
		}
	}
}