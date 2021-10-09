//A class implements an interface, but one interface extends another interface.
interface Printable{
	void print();
}
interface Showable extends Printable{
	void show();
}
class TestMultiInterface2 implements Showable{
	public void show(){System.out.println("hello..");}
	public void print(){System.out.println("man..");}

	public static void main(String[] args){
		TestMultiInterface2 t=new TestMultiInterface2();
		t.show();
		t.print();
	}
}
