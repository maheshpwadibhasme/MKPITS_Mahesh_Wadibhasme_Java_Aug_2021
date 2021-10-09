class Student{
	void getdata(String name){
		System.out.println("Name ="+name);
	}
	void getdata(String name,String address){
		getdata("mahesh");
		System.out.println("Address ="+address);
	}
}
class TestOverloading4{
	public static void main(String[] args){
		Student s1=new Student();
		s1.getdata("mahesh","nagpur");
	}
}