//In this example, we have created two methods, first add() method performs addition of two numbers and
//second add method performs addition of three numbers.
class Calculate{
	void add(int n1,int n2){
		int res=n1+n2;
		System.out.println("Addition of 2 no ="+res);
	}
	void add(int n1,int n2,int n3){
		int res=n1+n2+n3;
		System.out.println("Addition of 3 no ="+res);
	}
}
class TestCalculate{
	public static void main(String[] args){
		Calculate c1=new Calculate();
		c1.add(2,3);
		c1.add(2,3,5);
	}
}