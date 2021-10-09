class Bank{
	int getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class UCO extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest(){
		return 9;
	}
}
class RunTimePolymorphism1{
	public static void main(String[] args){
	Bank b=null;
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("Enter Bank Name :-");
	String bn=scan.next();

		if(bn.equals("SBI")){
			b=new SBI();
		}
		else if(bn.equals("UCO")){
			b=new UCO();
		}
		else if(bn.equals("ICICI")){
			b=new ICICI();
		}
		System.out.println(bn+" Bank Rate Of Interest ="+b.getRateOfInterest());
	}
}
