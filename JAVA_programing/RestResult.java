//create a class TestResult to use the class Result created in mkpits package.
import mkpits1.Result;
import java.util.*;
class RestResult{
	public static void main(String[] args){
	Result r=new Result();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter math marks = ");
	int math=scan.nextInt();
	System.out.println("Enter phy marks = ");
	int phy=scan.nextInt();
	System.out.println("Enter chem marks = ");
	int chem=scam.nextInt();
	
	int total=r.calculateTotal(math,phy,chem);
	System.out.println("Total marks = "+total);
	
	float per=r.calculatePercentage();
	System.out.println("Percentage = "+per);
	
	String grade=r.calculateGrade();
	System.out.println("Grade = "+grade);
	}
}
