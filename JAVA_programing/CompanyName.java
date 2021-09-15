//wap to create a string variable to store company name and then display the company name
import java.util.*;
class CompanyName{
	public static void main(String[] args){
		String name = "mahesh";
		System.out.println("Company name = "+name);
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Company Name = ");
		name=scan.next();
		System.out.println("Company name ="+name);
	}
}