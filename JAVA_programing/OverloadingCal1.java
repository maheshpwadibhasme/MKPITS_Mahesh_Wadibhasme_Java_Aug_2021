class OverloadingCal1{
	void sum(int n1,long n2){
		System.out.println(n1+n2);
	}
	void sum(int n1,int n2,int n3){
		System.out.println(n1+n2+n3);
	}
	public static void main(String[] args){
		OverloadingCal1 c1=new OverloadingCal1();
		c1.sum(20,20);
		c1.sum(20,10,20);
	}
}