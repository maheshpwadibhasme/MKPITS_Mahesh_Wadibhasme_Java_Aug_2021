class Calculate{
	private float roi;

	public void setRoi(float roi){
		this.roi=roi;
	}

	public float calintrest(float pa,int nom){
		float pi=pa*roi*nom;
		return pi;
	}
}
class TestC{
	public static void main(String[] args){
		Calculate a=new Calculate();
		a.setRoi(20);
		float f=a.calintrest(1000,2);
		System.out.println("Total amount with intrest ="+f);
	}
}