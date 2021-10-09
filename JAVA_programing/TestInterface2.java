interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw(){
		System.out.println("code to draw circle..");
	}
}
class Rectangle implements Shape{
	public void draw(){
		System.out.println("code to draw rectangle..");
	}
}
public class TestInterface2{
	public static void main(String[] args){
		Shape s=new Circle();
		s.draw();

		s=new Rectangle();
		s.draw();
	}
}