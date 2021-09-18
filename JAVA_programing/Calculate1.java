//Java Program to get the cube of a given number using the static method
class Calculate1{
	static int cube(int x){
		return x*x*x;
		}
		public static void main(String[] args){
			int result=Calculate1.cube(2);
			System.out.println(result);
			}
}