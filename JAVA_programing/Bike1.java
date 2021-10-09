class vehical{
	void run(){
		System.out.println("vehical id running");
	}
}
class Bike1 extends vehical{
	void run(){
		System.out.println("Bike is running sefely");
	}
	public static void main(String[] args){
		Bike1 obj=new Bike1();
		obj.run();
	}
}