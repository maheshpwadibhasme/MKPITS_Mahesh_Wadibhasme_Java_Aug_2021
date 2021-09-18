//Let's understand the problem if we use this keyword by the example given below:
class Student{
	int rollno;
	String name;
	float fee;

	Student(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display(){
		System.out.println("Rool No. = "+rollno);
		System.out.println("Name = "+name);
		System.out.println("Fee = "+fee);
	}
}
class TestThis2{
	public static void main(String[] args){
	Student s1=new Student(1,"Mahesh",500);
	Student s2=new Student(2,"Avi",400);
	s1.display();
	s2.display();
	}
}