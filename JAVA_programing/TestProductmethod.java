//create a class product and initilize it with method.
class Product11{
	int prodid;
	String prodname;
	double prodprice;

	public void insertProductData(int pid,String pn, double pr){
		prodid=pid;
		prodname=pn;
		prodprice=pr;
	}
	public void displayProductData(){
			System.out.println("Product Id :- "+prodid);
			System.out.println("Product Name :- "+prodname);
			System.out.println("product Price:- "+prodprice);
	}
}
class TestProductmethod{
	public static void main(String[] args){
		Product11 p=new Product11();
		p.insertProductData(12,"cooler",12000);
		p.displayProductData();
	}
}