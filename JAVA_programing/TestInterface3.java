//In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.
interface Printable{
	void print();
}
class A6 implements Printable{
	public void print(){
		System.out.println("Hello..");
	}
}
class TestInterface3{
	public static void main(String[] args){
		A6 obj=new A6();
		obj.print();
	}
}