//create a class TestResult to use the class Result created in mkpits package.
import mkpits1.Result;
import java.util.*;
class TestResult{
	public static void main(String[] args){
	Result r1=new Result();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter math marks = ");
	int math=scan.nextInt();
	System.out.println("Enter phy marks = ");
	int phy=scan.nextInt();
	System.out.println("Enter chem marks = ");
	int chem=scan.nextInt();
	
	int total=r1.calculateTotal(math,phy,chem);
	System.out.println("Total marks = "+total);
	
	float per=r1.calculatePercentage();
	System.out.println("Percentage = "+per);
	
	String grade=r1.calculateGrade();
	System.out.println("Grade = "+grade);
	}
}
