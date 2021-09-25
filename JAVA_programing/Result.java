//create a package mkpits1 and in it create a class Result having methods to calculate total, 
//percentage and grade.
//create a class TestResult to use the class Result created in mkpits package.

package mkpits1;
public class Result{
	int math,phy,chem;
	int total;
	float per;
	String grade;
	public int calculateTotal(int m,int p,int c){
		math=m;
		phy=p;
		chem=c;
		total=math+phy+chem;
		return total;
	}
	public float calculatePercentage(){
		per=(float)(total/300.0f)*100.0f;
		return per;
	}
	public String calculateGrade(){
		if(per>=75){
			grade="distinction";
		}else if(per<75 && per>=60){
			grade="first";
		}else if(per<60&&per>40){
			grade="pass";
		}else{
			grade="fail";
		}
		return grade;
	}
}