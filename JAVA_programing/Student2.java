 //Java Program to demonstrate the use of the parameterized constructor.
 class Student2{
 	int rno;
 	long mobno;
 	String name,add;
 	public Student2(int r,String n,long m,String a){
 		rno=r;
 		name=n;
 		mobno=m;
 		add=a;
 	}
 	void display(){
 		System.out.println("Student Roll No.= "+rno);
		System.out.println("Student Name= "+name);
		System.out.println("Student Mobile No ="+mobno);
		System.out.println("Student Address ="+add);
 	}
 	public static void main(String[]args){
 		Student2 s1=new Student2(54,"mahesh",7030486117L,"bhojapur");
 		s1.display();
 		System.out.println("------------------------------------------------");

 		Student2 s2=new Student2(21,"raju",8806928241L,"bhojaour");
 		s2.display();
 		System.out.println("------------------------------------------------");
 	}
 }