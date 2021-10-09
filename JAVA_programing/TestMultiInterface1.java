//Multiple inheritance in Java by interface
interface Printable{
	void print();
}
interface Showable{
	void show();
}
class A7 implements Printable,Showable{
	public void print(){System.out.println("hello");}
	public void show(){System.out.println("mahesh");}
}
class TestMultiInterface1{
	public static void main(String[] args){
		A7 obj=new A7();
		obj.print();
		obj.show();
	}
}