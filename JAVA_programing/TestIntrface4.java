//Java Interface Example: Drawable
interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw(){
		System.out.println("code for circle..");
	}
}
class TestIntrface4{
	public static void main(String[] args){
		Circle c=new Circle();
		c.draw();
	}
}