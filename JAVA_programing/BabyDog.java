class Animals{
	void eat(){
		System.out.println("Animals is eatting...");
	}
}
class Dog extends Animals{
	void eat(){
		System.out.println("Dog is eatting...");
	}
}
class BabyDog extends Dog{
	public static void main(String[] args){
		Animals a=new BabyDog();
		a.eat();
	}
}