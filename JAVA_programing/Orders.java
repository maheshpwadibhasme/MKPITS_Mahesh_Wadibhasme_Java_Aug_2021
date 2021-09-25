//create a package mkpits2 and a class orders having 
//field orderno,orderdate(string) , customername, productname , price and quantity 
//and methods insert, calculate totalbillamount and display .

package mkpits2;
public class Orders{
	int orderno;
	String orderdate;
	String productname,customername,customeraddress;
	int productprice;
	int productquantity;
	float totalbillamount,totalbillamount1;
	float GST=0.18f;
	float totalGST;

	public void insert(int on,String od,String cn,String ca,String pn,int p,int q){
		orderno=on;
		orderdate=od;
		customername=cn;
		customeraddress=ca;
		productname=pn;
		productprice=p;
		productquantity=q;
	}
	
	public void calculateTotalBillAmount(){
		totalbillamount1=(productprice*productquantity);
		totalbillamount=(totalbillamount1)+((productprice*productquantity)*0.18f);
	}
	
	public void display(){
		System.out.println("Order No. ="+orderno);
		System.out.println("Order Date ="+orderdate);
		System.out.println("Customer Name ="+customername);
		System.out.println("Customer Address ="+customeraddress);
		System.out.println("Product Name ="+productname);
		System.out.println("Product Price ="+productprice);
		System.out.println("Product Quantity ="+productquantity);
		System.out.println("Total Bill Amount = Rs-"+totalbillamount1);
		System.out.println("GST = 18%");
		System.out.println("Total Bill Amount +18% GST = Rs-"+totalbillamount);
	}
}