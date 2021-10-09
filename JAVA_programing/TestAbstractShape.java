//In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.
//In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle..");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("drawing circle..");
	}
}
class TestAbstractShape{
	public static void main(String[] args){
		Shape s;

		s=new Circle();
		s.draw();
	}
}