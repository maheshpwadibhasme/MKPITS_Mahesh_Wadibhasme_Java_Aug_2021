//Java Program to demonstrate having the main method in
//another class
//Creating Student class.

 class Studt1{
	int id;
	String name;
}
class TestStudt1{
	public static void main(String[] args){
		Studt1 s=new Studt1();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
