//Java Program to demonstrate having the main method in
//another class
//Creating Student class.
class Studt{
	int id ;
	String name;
}
class TestStudt2{
	public static void main(String[] args){
		Studt s=new Studt();
		s.id=152;
		s.name="mahesh";
		System.out.println("ID ="+s.id);
		System.out.println("Name ="+s.name);
	}
}