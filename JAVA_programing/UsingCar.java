//wap to create a class Car having fields model, color, make and methods start,stop .
class Car{
	String model;
	String color;
	public void start(){
		System.out.println("The Car Is Started");
	}
	public void stop(){
		System.out.println("The Car Is Stopped");
	}
}
class UsingCar{
	public static void main(String[] args){
		Car c1=new Car();
		c1.model="brezza";
		c1.color="black";
		System.out.println("Model ="+c1.model);
		System.out.println("Color ="+c1.color);
		c1.start();
		c1.stop();
	}
}