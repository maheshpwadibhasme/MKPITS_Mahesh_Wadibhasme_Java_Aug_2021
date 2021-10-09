//Let's see another example of java interface which provides the implementation of Bank interface.
interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{
	public float rateOfInterest(){
		return 7.5f;
	}
}
class ICICI implements Bank{
	public float rateOfInterest(){
		return 8.2f;
	}
}
class TestInterface6{
	public static void main(String[] args){
		Bank b=new SBI();
		System.out.println("Rate of interest:- "+b.rateOfInterest());
	}
}