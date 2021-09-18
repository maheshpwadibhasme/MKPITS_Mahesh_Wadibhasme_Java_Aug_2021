//Copying values without constructor
class Student6{
	int rno;
	String name;
	Student6(int r,String n){
		rno=r;
		name=n;
	}
	Student6(){
	}
	void display(){
		System.out.println("Roll No.="+rno);
		System.out.println("Name ="+name);
	}
	public static void main(String[] args){
		Student6 s1=new Student6(1,"mahesh");
		Student6 s2=new Student6();
		s2.rno=s1.rno;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}
}