//Java Runtime Polymorphism Example: Animal
class Animals{
	void eat(){
		System.out.println("Eatting..");
	}
}
class Dog extends Animals{
	void eat(){
		System.out.println("Dog is Eatting bread...");
	}
}
class Cat extends Animals{
	void eat(){
		System.out.println("Cat is Eatting Rat...");
	}
}
class Lion extends Animals{
	void eat(){
		System.out.println("Lion is Eatting Meat...");
	}
}
class RunTimePolymorphism6{
	public static void main(String[] args){
		Animals a;
		a=new Dog();
		a.eat();

		a=new Cat();
		a.eat();

		a=new Lion();
		a.eat();
	}
}