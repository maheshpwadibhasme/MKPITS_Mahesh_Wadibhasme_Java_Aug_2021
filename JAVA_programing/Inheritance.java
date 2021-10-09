//create a parent class person having fields name and address then create a inherited
//class student having new fields rno and marks
class Person{
	String name;
	String address;
}
class Student extends Person{
	int rno;
	int marks;
}
class Inheritance{
	public static void main(String[] args){
	Student s=new Student();
	s.rno=12;
	s.name="mahesh";
	s.address="nagpur";
	s.marks=85;

	System.out.println("Roll No. ="+s.rno);
	System.out.println("Name ="+s.name);
	System.out.println("Address ="+s.address);
	System.out.println("Marks ="+s.marks);
	}
}