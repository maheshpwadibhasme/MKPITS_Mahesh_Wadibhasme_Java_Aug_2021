//In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.
class Animals{
	void eat(){
		System.out.println("Eatting...");
	}
}
class Dog extends Animals{
	void bark(){
		System.out.println("Barking...");
	}
}
class Cat extends Animals{
	void meow(){
		System.out.println("meowing...");
	}
}
class TestHierachiInheri1{
	public static void main(String[] args){
		Cat c1=new Cat();//cat is child class of animals thats why they call only animal parent class.not dog class.
		c1.meow();
		c1.eat();

		Dog d1=new Dog();//Dog is child class of animals thats why they call only animal parent class, not cat class.
		d1.bark();
		d1.eat();
	}
}