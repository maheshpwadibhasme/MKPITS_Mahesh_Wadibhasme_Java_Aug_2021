//create a class testorders and accept orderno,orderdate,customername
// productname,price and quantity and call the methods of orders class.

import mkpits2.Orders;
import java.util.*;
class TestOrders{
	public static void main(String[] args){
	Orders r1=new Orders();
	Scanner scan=new Scanner(System.in);

	System.out.println("Order No. =");
	int orderno=scan.nextInt();

	System.out.println("Order Date =");
	String orderdate=scan.next();
	
	System.out.println("Customer Name =");
	String customername=scan.next();
		customername + =scan.next();

	System.out.println("Customer Address =");
	String customeraddress=scan.next();
	
	System.out.println("Product Name =");
	String productname=scan.next();

	System.out.println("Product Price  =");
	int productprice=scan.nextInt();

	System.out.println("Product Quantity =");
	int productquantity=scan.nextInt();

	r1.insert(orderno,orderdate,customername,customeraddress,productname,productprice,productquantity);
	r1.calculateTotalBillAmount();
	r1.display();
	}
}