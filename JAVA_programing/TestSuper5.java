class Animals{
	void eat(){
		System.out.println("Eating...");
	}
}
class Dog extends Animals{
	void eat(){
		System.out.println("Bread Eating");
	}

	void bark(){
		System.out.println("Barking...");
	}

	void work(){
		super.eat();
		bark();
	}
}
class TestSuper5{
	public static void main(String[] args){
		Dog d=new Dog();
		d.work();
	}
}