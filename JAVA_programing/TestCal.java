class Calculate{
	int addition(int n1,int n2){
		return n1+n1;
	}
	float addition(float n1,float n2){
		return n1+n1;
	}
	double addition(double n1,double n2){
		return n1+n2;
	}
}
class TestCal{
	public static void main(String[] args){
		Calculate cal=new Calculate();
		int res=cal.addition(2,3);
		System.out.println("Addition of two integer value is ="+res);

		float resf=cal.addition(2.2f,3.8f);
		System.out.println("Addition of two floating value is ="+resf);

		double resd=cal.addition(2.22,3.88);
		System.out.println("Addition of two double value is ="+resd);
	}
}