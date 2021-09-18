//Java Program to demonstrate the use of a static method.
class Student{
	int rno;
	String name;
	static String college="sbjain";

	static void change(){
		college="mkpits";
	}

	Student(int r,String n){
		rno=r;
		name=n;
	}
	void display(){
		System.out.println("Roll No.= "+rno);
		System.out.println("Name = "+name);
		System.out.println("college = "+college);
		System.out.println("------------------------------------------");
	}
}
public class TestStaticMethod{
	public static void main(String[] args){
		Student.change();
		Student s1=new Student(1,"Mahesh");
		Student s2=new Student(2,"Alekh");
		Student s3=new Student(3,"Gaurav");

		s1.display();
		s2.display();
		s3.display();
		}
}