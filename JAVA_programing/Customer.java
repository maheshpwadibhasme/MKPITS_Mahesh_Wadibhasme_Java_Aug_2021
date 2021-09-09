 //wap to accept customer name , productname,productprice and quantity
//and then print customername , productname,price, quantity and totalamount
import java .util.*;
class Customer
{
	public static void main(String[]args)
	{
		String customer_name;
		String product_name;
		int product_price=2000;
		int quantity;
		int total_amount;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter customer name = ");
		customer_name=scan.next();

		System.out.print("Enter product name = ");
		product_name=scan.next();

		System.out.print("product quantity = ");
		quantity=scan.nextInt();

		System.out.println("product_price = "+ 2000);

		total_amount = product_price * quantity;
		System.out.println("Total amount = "+ total_amount);


	}
}