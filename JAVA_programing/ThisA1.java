class A1{
	A1(){
		System.out.println("default constructor");
	}
	A1(int x){
		this();
		System.out.println(x);
	}
}
class ThisA1{
	public static void main(String[] args){
		A1 a=new A1(10);
	}
}