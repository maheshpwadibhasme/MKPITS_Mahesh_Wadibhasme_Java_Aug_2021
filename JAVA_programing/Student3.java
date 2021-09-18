//Let us see another example of default constructor
//which displays the zero and null values
class Student3{
	int rno;
	String name;
	void display(){
		System.out.println(rno+" "+name);
	}
	public static void main(String[] args){
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.display();
		s2.display();
	}
}