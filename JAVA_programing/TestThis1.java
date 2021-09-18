//Let's understand the problem if we don't use this keyword by the example given below:
class Student{
	int rollno;
	String name;
	float fee;

	Student(int rollno,String name,float fee){
		rollno=rollno;
		name=name;
		fee=fee;
	}
	void display(){
		System.out.println("Roll No.= " +rollno);
		System.out.println("Name =" +name);
		System.out.println("Fee " +fee);
	}
}
class TestThis1{
	public static void main(String[] args){
		Student s1=new Student(1,"mahesh",200f);
		s1.display();

		}
}