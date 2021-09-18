//Java Program to get the cube of a given number using the static method using main inside another class
class Calculate3{
	static int cube(int x){
	return x*x*x;
	}
}
class TestCalculate3{
	public static void main(String[] args){
		int result=Calculate3.cube(2);
		System.out.println("cube of 2 = "+result);
	}
}