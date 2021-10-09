class Vehical{
	void run(){
		System.out.println("Vehical is running");
	}
}
class Bike extends Vehical{
	public static void main(String[] args){
		Bike obj=new Bike();
		obj.run();
	}
}