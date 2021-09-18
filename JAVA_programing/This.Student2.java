//Program where this keyword is not required
class Student{
	int rollno;
	String name;
	float fee;
	Student(int r,String n,float f){
		rollno=r;
		name=n;
		float=f;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}
class This.Student2{
	public static void main(String[] args){
		Student s1=new Student(1,"mahesh",500f);
		s1.display();
	}
}