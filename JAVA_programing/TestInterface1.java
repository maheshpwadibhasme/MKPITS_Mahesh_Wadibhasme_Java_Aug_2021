//create an interface shape having method declaration for draw method
interface Shape1{
	void draw();
}
class Circle implements Shape1{
	public void draw(){
		System.out.println("code to draw circle..");
	}
}
public class TestInterface1{
	public static void main(String[] args){
		Shape1 s=new Circle();
		s.draw();
	}
}