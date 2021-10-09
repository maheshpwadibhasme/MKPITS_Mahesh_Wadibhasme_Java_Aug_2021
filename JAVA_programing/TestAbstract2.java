 //Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
	Bike(){
		System.out.println("Bike is created..");
	}
	abstract void run();
	void changeGear(){
		System.out.println("gear changed..");
	}
}
class Honda extends Bike{
	void run(){
		System.out.println("Bike is runnig..");
	}
}
class TestAbstract2{
	public static void main(String[] args){
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();
	}
}


