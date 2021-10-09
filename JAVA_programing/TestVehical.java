class Vehical{
	void run(){
		System.out.println("Vehical is running");
	}
}
class Bike extends Vehical{
	void run (){
		System.out.println("Bike is running");
	}
}
class Car extends Vehical{
	void run(){
		System.out.println("Car is running");
	}
}
class TestVehical{
	public static void main(String[] args){
		Bike b1=new Bike();
		b1.run();

		Car c1=new Car();
		c1.run();
	}
}