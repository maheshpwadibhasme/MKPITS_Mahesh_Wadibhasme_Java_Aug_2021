class Account{
	int accno;
	int bal=1000;
	String deposit(int accno, int amt){
		return "account class deposited method";
	}
	String withdrawl(int accno,int amt){
		return "account class withdrawl method";
	}
}
class Saving extends Account{
	int interest=500;
	String deposit(int accno,int amt){
		this.accno=accno;
		bal=bal+amt+interest;
		return "account deposited for acct no " + accno + ", bal is " + bal;
	}
	String withdrawl(int accno,int amt){
		this.accno=accno;
		if(amt > bal){
			return "Insufficient balance";
		}else{
			bal=bal-amt;
			return "account withdrawl for acct no " + accno + ", bal is " + bal;
		}
	}
}
public class TestAccountOverriding1{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Enter Account no =");
		int accno=s.nextInt();

		System.out.println("Enter amount =");
		int amt=s.nextInt();

		System.out.println("do you want to deposit or withdrawl");
		String ans=s.next();

		Saving act=new Saving();
		String str;
		if(ans.equals("deposit")){
			str=act.deposit(accno,amt);
			System.out.println(str);
		}
		else if(ans.equals("withdrawl")){
			str=act.withdrawl(accno,amt);
			System.out.println(str);
		}
	}
}