class Animals{
	String color="white";
}
class Dog extends Animals{
	String color="black";
	void printColor(){
		System.out.println("Animal color = "+super.color);
	}
}
class Babydog extends Dog{
	String color="Brown";
	void printColor1(){
		System.out.println("Dog color = "+super.color);
		System.out.println("Babydog color = "+color);
		printColor();
	}
}
class TestSuper2{
	public static void main(String[] args){
		Babydog b=new Babydog();
		b.printColor1();
	}
}