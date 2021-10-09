//The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:
class Animals{
	Animals(){
		System.out.println("Animal is created");
	}
}
class Dog extends Animals{
		Dog(){
		super();
		System.out.println("Dog is created");
	}
}
class TestSuper7{
	public static void main(String[] args){
		Dog d=new Dog();
	}
}