//Program where this keyword is not required
class Student{
	int rollno;
	String name;
	float fee;
	Student(int r,String n,float f){
		rollno=r;
		name=n;
		fee=f;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}
class ThisStudent2{
	public static void main(String[] args){
		Student s1=new Student(1,"mahesh",520);
		Student s2=new Student(2,"Gaurav",681);
		s1.display();
		s2.display();
	}
}