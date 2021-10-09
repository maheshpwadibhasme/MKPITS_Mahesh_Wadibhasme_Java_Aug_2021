//Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
//However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks
//could provide 8%, 7%, and 9% rate of interest.Java method overriding example of bank
class Bank{
	int getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class AXIS extends Bank{
	int getRateOfInterest(){
		return 9;
	}
}
class TestBankOverriding{
	public static void main(String[] args){
		SBI s1=new SBI();
		ICICI i1=new ICICI();
		AXIS a1=new AXIS();

		System.out.println("SBI rate of interest ="+s1.getRateOfInterest());
		System.out.println("ICICI rate of interest ="+i1.getRateOfInterest());
		System.out.println("AXIS rate of interest ="+a1.getRateOfInterest());
	}
}