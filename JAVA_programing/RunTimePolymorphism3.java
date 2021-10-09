//Example of Java Runtime Polymorphism
//In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and
//overrides its run() method. We are calling the run method by the reference variable of Parent class.
//Since it refers to the subclass object and subclass method overrides the Parent class method,
//the subclass method is invoked at runtime.
class Bike{
	void run(){
		System.out.println("Bike Is Running...");
	}
}
class Splendar extends Bike{
	void run(){
		System.out.println("running safely with 60km");
	}
}
class RunTimePolymorphism3{
	public static void main(String[] args){
		Bike b=new Splendar();
		b.run();
	}
}