//Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:
interface Drawable{
	void draw();
	default void msg(){System.out.println("hello ram..");}
}
class Printable implements Drawable{
	public void draw(){System.out.println("code for print");}
}
class TestDefaultInterface{
	public static void main(String[] args){
		Drawable d=new Printable();
		d.msg();
		d.draw();
	}
}