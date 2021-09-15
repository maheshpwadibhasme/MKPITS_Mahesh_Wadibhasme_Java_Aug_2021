//Electricity bill
import java.util.*;
class Electricity_bill{
	public static void main(String[] args){
		int unit;
		double cost=0;
		double mandatoryCost = 102;
		double vehicleCost=0;
		double totalCost=0;
		double tax=0;
		Scanner scan =new Scanner(System.in);

		System.out.print("Enter Costomer Meter No. =");
		int num=scan.nextInt();

		System.out.print("Enter Costomer Name = ");
		String name=scan.next();

		System.out.print("Unit Usage =");
		unit=scan.nextInt();

		if(unit<=100){
			cost=unit*3.44;
		}
		else if(unit>100 && unit<=300){
			cost=100*3.44+(unit-100)*7.34;
		}
		else if(unit>300 && unit<=500){
			cost=(100*3.44)+(200*7.34)+(unit-200)*10.36;
		}
		else if(unit>500 && unit<=1000){
			cost=(100*3.44)+(200*7.34)+(200*10.36)+(unit-500)*11.82;
		}
		else if(unit>1000){
			cost=(100*3.44)+(200*7.34)+(200*10.36)+(500*11.82)+(unit-1000)*11.82;
		}
			vehicleCost=unit*1.38;
			totalCost=cost+mandatoryCost+vehicleCost;
			System.out.println("unit cost ="+cost);
			tax=0.16*totalCost;
			System.out.println("Mandatory Cost ="+mandatoryCost);
			System.out.println("Vehicle Cost 1.38 Per Unit ="+vehicleCost);
			System.out.println("Tax 16% On Total Cost ="+tax);
			totalCost=totalCost+tax;
			System.out.println("Total Electricity Bill Amount = "+totalCost);

			float AfterPayCost=(float)totalCost+10;
			System.out.println(+AfterPayCost);
			System.out.println("If You Pay Bill Before 10th Aug Total Cost ="+totalCost);
			System.out.println("If You Pay Bill After 10th Aug Total Cost ="+AfterPayCost);

	}
}