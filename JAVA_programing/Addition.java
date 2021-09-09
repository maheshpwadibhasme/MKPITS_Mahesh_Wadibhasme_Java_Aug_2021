//wap to accept 2 no. and then print addition of 2 no.
	import java.util.*;
	class Addition{
	public static void main(String[]args){
	int num1,num2;
	int result;

	Scanner scan = new Scanner(System.in);

	System.out.println("enter number1 = ");
	num1=scan.nextInt();
	
	
	System.out.println("enter number2 = ");
	num2=scan.nextInt();

	result=num1+num2;
	System.out.println("Adition of 2 no.= " + result);

	}
	}
//cmd
//Microsoft Windows [Version 10.0.18363.1556]
//(c) 2019 Microsoft Corporation. All rights reserved.

//C:\Users\HP>e:

//E:\>cd javaprogram

//E:\javaprogram>javac Addition.java

//E:\javaprogram>java Addition
//enter number1 =
//12
//enter number2 =
//10
//Adition of 2 no.= 22

