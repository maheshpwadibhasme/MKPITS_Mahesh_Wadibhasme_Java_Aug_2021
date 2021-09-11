//8 -wap to accept basicsalary and designation like 'm' for manager ,
//'c' for clerk and 'p' for peon
//and then calculate bonus=1000 for 'm', 500 for 'c', 100 for 'p'
//and display basicsalary,bonus and totalsalary 
#include<stdio.h>
int main(){
	int basicsalary,bonus;
	char designation;
	float totalsalary;
	printf("\n enter basicsalary = ");
	scanf("%d",&basicsalary);
	printf(" enter designation = ");
	fflush(stdin);
	scanf("%c",&designation);
	if(designation=='m'){
		printf("\n designation :- manager");
		bonus=1000;
	}else if(designation=='c'){
		printf("\n designation :- clerk");
		bonus=500;
	}else if(designation=='p'){
		printf("\n designation :- peon");
		bonus=100;
	}else{
		printf("\n not valid designation");
	}
	totalsalary = basicsalary+bonus;
	printf("\n basic salary = %d",basicsalary);
	printf("\n bonus =%d",bonus);
	printf("\n total salary =%0.2f",totalsalary);
	
}
