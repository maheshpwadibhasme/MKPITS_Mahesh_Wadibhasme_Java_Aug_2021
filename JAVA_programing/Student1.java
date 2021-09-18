//Example of Constructor Overloading
//Java Program to demonstrate the use of the parameterized constructor.
class Student1{
	int rno;
	String name;
		Student1(int r){
			rno=r;
		}

		Student1(int r, String n){
			rno=r;
			name=n;
		}
		void display(){
			System.out.println("Student Roll No. ="+rno);
			System.out.println("Student Name ="+name);
		}
		public static void main(String[] args){
			Student1 s=new Student1(1);
			Student1 s1=new Student1(1,"mahesh");
			s.display();
			s1.display();
		}

}