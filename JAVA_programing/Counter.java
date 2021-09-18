class Counter{
int count=0;
	Counter(){
	count=count+1;
	}
	void display(){
		System.out.println("count ="+count);
		}
	public static void main(String[] args){
	Counter c1=new Counter();
	c1.display();
	Counter c2=new Counter();
	c2.display();
	Counter c3=new Counter();
	c3.display();
	}
}