//We can also create multiple objects and store information in it through reference variable.
class Studt{
	int id;
	String name;
	String address;
}
class TestStudt3{
	public static void main(String[] args){
		Studt s1 =new Studt();
		Studt s2=new Studt();
		s1.id=1;
		s1.name="mahesh";
		s1.address="bhojapur";
		s2.id=2;
		s2.name="Alekh";
		s2.address="Nagpur";
		System.out.println("ID ="+s1.id);
		System.out.println("Name ="+s1.name);
		System.out.println("Address ="+s1.address);
		System.out.println("ID ="+s2.id);
		System.out.println("Name ="+s2.name);
		System.out.println("Address ="+s2.address);
	}
}