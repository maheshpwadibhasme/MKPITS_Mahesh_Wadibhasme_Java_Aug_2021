 //Java program to initialize the values from one object to another object.
 class Student5{
 	int rno;
 	String name;
 	Student5(int r, String n){
 		rno=r;
 		name=n;
 	}
 	Student5(Student5 s){
 		rno=s.rno;
 		name=s.name;
 	}
 	void display(){
 		System.out.println("Roll No. ="+rno);
 		System.out.println("Name ="+name);
 	}
 	public static void main(String[] args){
 		Student5 s1=new Student5(1,"mahesh");
 		Student5 s2=new Student5(s1);
 		s1.display();
 		s2.display();
 	}
 }