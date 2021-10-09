//Example of Method Overloading with Type Promotion if matching found
class OverloadingCal2{
	void sum(int a,int b){
		System.out.println("int arg method invoked");
	}
	void sum(long a,long b){
			System.out.println("long arg method invoked");
	}
	public static void main(String[] args){
		OverloadingCal2 c2=new OverloadingCal2();
		c2.sum(20,20);//int value so int method called
		c2.sum(123456789L,123456789L);//long value so int method called
	}
}