//The following program, IfElseDemo, assigns a grade based on the value of a test score:
//an A for a score of 90% or above, a B for a score of 80% or above, and so on.

class IfElseDemo{
	public  static void main(String[]args){
		int testscore=75;
		char grade;
		if(testscore>=90){
			grade='A';
		}else if(testscore>=80){
			grade='B';
		}else if(testscore>=70){
			grade='C';
		}else{
			grade='F';
		}
		System.out.println("Grade = "+grade);

	}
}