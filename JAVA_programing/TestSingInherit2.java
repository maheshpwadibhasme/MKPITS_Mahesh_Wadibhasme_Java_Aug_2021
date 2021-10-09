//another example of single inheritance
//create a parent class person and then create a child class student

class Person{
	String name;
	String address;

	void insertPersonData(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayPersonData(){
		System.out.println(name+" "+address);
	}
}
class Student extends Person{
	int rno;
	int marks;

	void insertStudentData(int rno,int marks){
		this.rno=rno;
		this.name=name;
	}
	void displayStudentData(){
		System.out.println(rno+" "+marks);
	}
}
class TestSingInherit2{
	public static void main(String[] args){
		Student s=new Student();
		s.insertPersonData("mahesh","nagpur");
		s.insertStudentData(12,86);
		s.displayPersonData();
		s.displayStudentData();
		}
}