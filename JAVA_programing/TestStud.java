//Object and Class Example: Initialization through method
class Stud{
	int rno;
	String name;
	void insertRecord(int r,String n){
		rno=r;
		name=n;
	}
	void display(){
		System.out.println(rno+" "+name);
	}
}
class TestStud{
	public static void main(String[] args){
		Stud s1=new Stud();
		Stud s2=new Stud();
		s1.insertRecord(1,"mahesh");
		s1.display();
		s2.insertRecord(2,"vishal");
		s2.display();
	}
}