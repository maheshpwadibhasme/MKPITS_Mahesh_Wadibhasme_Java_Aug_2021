//Write-Only class
//create a Write-Only class Book  having setter methods
class Student{
	private int rno;
	private String name;

	public void setRno(int rno){
		this.rno=rno;
	}

	public void setName(String name){
		this.name=name;
	}

	public void display(){
		System.out.println("Roll No. ="+rno);
		System.out.println("Name ="+name);
	}
}
class TestG{
	public static void main(String[] args){
		Student s=new Student();
		s.setRno(12);
		s.setName("mahesh");
		s.display();
	}
}