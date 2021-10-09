//Another example of super keyword where super() is provided by the compiler implicitly.
class Animals{
	Animals(){
		System.out.println("animal are created");
	}
}
class Dog extends Animals{
	Dog(){
		System.out.println("Dog are created");
	}
}
class TestSuper9{
	public static void main(String[] args){
		Dog d=new Dog();
	}
}
//their is no need to use super() keywords.