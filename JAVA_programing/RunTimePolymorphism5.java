//Java Runtime Polymorphism Example: Shape
class Shape{
	void draw(){
		System.out.println("drawing...");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("drawing circle...");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle...");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("drawing triangle");
	}
}
class RunTimePolymorphism5{
	public static void main(String[] args){
		Shape s;
		s=new Circle();
		s.draw();

		s=new Rectangle();
		s.draw();

		s=new Triangle();
		s.draw();
	}
}