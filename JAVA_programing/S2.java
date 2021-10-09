//this: to pass as an argument in the method
class S2{
	void m(S2 obj){
		System.out.println("method is called");
	}
	void display(){
		m(this);
	}
	public static void main(String[] args){
		S2 s=new S2();
		s.display();
	}
}