//Rule: Call to this() must be the first statement in constructor.
class Student{
	int rno;
	String name,course;
	float fee;

	Student(int rno,String name,String course){
		this.rno=rno;
		this.name=name;
		this.course=course;
	}
	Student(int rno,String name,String course,float fee){
		this(rno,name,course);
		this.fee=fee;

	}
	void display(){
		System.out.println("Roll No.="+rno);
		System.out.println("Name = "+name);
		System.out.println("Course = "+course);
		System.out.println("Fee = "+fee);
	}
}
class ThisStudent{
	public static void main(String[] args){
		Student s=new Student(1,"mahesh","java",10000);
		s.display();
	}
}