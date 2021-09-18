//Java program to overload constructors
class Student4{
	int rno;
	int age;
	String name;
	Student4(int r,String n){
		rno=r;
		name=n;
	}
	Student4(int r,String n,int a){
		rno=r;
		name=n;
		age=a;
	}
	void display(){
		System.out.println("Roll No. ="+rno);
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
	}
	public static void main(String[] args){
		Student4 s1=new Student4(1,"om");
		Student4 s2=new Student4(2,"mahesh",23);
		s1.display();
		System.out.println("---------------------------------");
		s2.display();
		System.out.println("_________________________________");
	}
}