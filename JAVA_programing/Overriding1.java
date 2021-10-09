//If subclass (child class) has the same method as declared in the parent class,
//it is known as method overriding in Java.
class Figure{
	void draw(){
		System.out.println("Draw Method od Figure class");
	}
}
class Traingle extends Figure{
	void draw(){
		System.out.println("Draw Method of Traingle class");
	}
}
class Overriding1{
	public static void main(String[] args){
		Figure f=new Figure();
		f.draw();

		Traingle t=new Traingle();
		t.draw();
	}
}