//Runtime Polymorphism in Java
class Parents{
	void display(){
		System.out.println("Hello from Parent class display method");
	}
}
class Child extends Parents{
	void display(){
		System.out.println("Hello from Child Class display method");
	}
}
class RunTimePolymorphism{
		public static void main(String[] args){
			Parents p;
			p=new Child();
			p.display();
		}
}