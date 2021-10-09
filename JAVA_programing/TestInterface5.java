interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("code for rectangle..");
	}
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("code for circle..");
	}
}
class TestInterface5{
	public static void main(String[] args){
		//Drawable d=new Rectangle();
		//d.draw();
		Drawable d=new Circle();
		d.draw();
	}
}