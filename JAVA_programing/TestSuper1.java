class Animals{
	String color="white";
}
class Dog extends Animals{
	String color="black";
	void printColor(){
		System.out.println("color = "+color);
		System.out.println("color = "+super.color);
	}
}
class TestSuper1{
	public static void main(String[] args){
		Dog d=new Dog();
		d.printColor();
	}
}