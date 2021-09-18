//Java Program to demonstrate the use of static variable
class Student{
	int rno;
	String name;
 static String college="Sbjain";

	Student(int r,String n){
			rno=r;
			name=n;
	}
	void display(){
		System.out.println("Roll No. = " +rno);
		System.out.println("Name = " +name);
		System.out.println("College = " +college);
		System.out.println("---------------------------------------");
	}
}

public class TestStaticVariable1{
	public static void main(String[] args){
		Student s1=new Student(1,"mahesh");
		s1.display();
		Student s2=new Student(2,"gaurav");
		s2.display();
		Student s3=new Student(3,"alekh");
		s3.display();
	}
}
