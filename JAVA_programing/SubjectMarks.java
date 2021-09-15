//wap to accept 3 subject marks and calculate total , per and grade
import java.util.*;
class SubjectMarks{
	public static void main(String[] args){
		int m1,m2,m3;
		float total,per;
		char grade;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter marks Sub1 =");
		m1=scan.nextInt();
		System.out.print("Enter Marks Sub2 =");
		m2=scan.nextInt();
		System.out.print("Enter Marks Sub3 =");
		m3=scan.nextInt();
		total=m1+m2+m3;
		System.out.println("Total ="+total);
		per=(float)(total/300.0f)*100.0f;
		System.out.println("Percentege = "+per+"%");
			if(per>=75){
				grade='A';
			}else if(per>=60 && per<75){
				grade='B';
			}else if(per>=40 && per<60){
				grade='C';
			}else{
				grade='F';
			}
			System.out.println("Grade ="+grade);
		}
}