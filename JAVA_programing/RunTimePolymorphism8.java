//Java Runtime Polymorphism with Multilevel Inheritance
//Let's see the simple example of Runtime Polymorphism with multilevel inheritance.
class Animals {
	void eat(){
		System.out.println("Animal is eatting...");
	}
}
class Dog extends Animals{
	void eat(){
		System.out.println("Dog is eating...");
	}
}
class Cat extends Dog{
	void eat(){
		System.out.println("Cat is eatting...");
	}
}
class RunTimePolymorphism8{
	public static void main(String[] args){
		Animals a1,a2,a3;
		a1=new Animals();
		a1.eat();

		a2=new Dog();
		a2.eat();

		a3=new Cat();
		a3.eat();
	}
}
