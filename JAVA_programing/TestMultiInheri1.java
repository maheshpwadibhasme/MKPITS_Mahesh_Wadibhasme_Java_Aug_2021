//Example of Multilevel Inheritance
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
class BabyDog extends Dog{
	void weep(){
		System.out.println("weeping..");
	}
}
class TestMultiInheri1{
	public static void main(String[] args){
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}