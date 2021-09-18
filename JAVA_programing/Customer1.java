package bank;
import sbi.Account;
class Customer1{
	public static void main(String[] args){
	Account act=new Account();
	String str=act.deposit(100);
	System.out.println(str);
	}
}