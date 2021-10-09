//Read-Only class
//create a readonly class Book  having getter methods
class Student{
	private int rno=12;
	private String name ="Kshitij";
	
	public int getRno(){
		return rno;
	}
	
	public String getName(){
		return name;
	}
}
class TestS{
	public static void main(String[] args){
		Student s=new Student();
		System.out.println("Student Roll No. = "+s.getRno());
		System.out.println("Student Name = "+s.getName());
	}
}