//create a class product and create 2 objects
class Prod{
	int prodid;
	String prodname;
	double prodprice;
}
class TestProd{
	public static void main(String[] args){

		Prod p1=new Prod();
		p1.prodid=1;
		p1.prodname="AC";
		p1.prodprice=15000;
		System.out.println("Product Id ="+p1.prodid);
		System.out.println("Product Name ="+p1.prodname);
		System.out.println("Product Price ="+p1.prodprice);
		System.out.println("-----------------------------------");

		Prod p2=new Prod();
		p2.prodid=2;
		p2.prodname="FAN";
		p2.prodprice=1200;
		System.out.println("Product Id ="+p2.prodid);
		System.out.println("Product Name ="+p2.prodname);
		System.out.println("Product Price ="+p2.prodprice);
		System.out.println("____________________________________");
	}
}