class Bike{
	private int speed;
	Bike(){
		System.out.println("Bike is created");
		speed=100;
	}
	void display(){
		System.out.println("Speed of bike is="+speed);
	}
}
class TestBike{
	public static void main(String[] args){
		Bike b=new Bike();
		b.display();
	}
}