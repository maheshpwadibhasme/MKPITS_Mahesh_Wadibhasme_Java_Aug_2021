class Animals{
	void eat(){
		System.out.println("Eatting....");
	}
}
class Dog extends Animals{
	void bark(){
		System.out.println("Barking....");
	}
}
class TestSingInheri{
	public static void main(String[] args){
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}