//5-wap to accept basicsalary and designation like 'm' for manager ,
//'c' for clerk and 'p' for peon
//and then calculate bonus=45% of basicsalary for 'm', bonus=35% of basicsalary for 'c', bonus=15% of basic salary  for 'p'
//and display basicsalary,bonus and totalsalary 
#include<stdio.h>
int main(){
	int basicsalary;
	char designation;
	float bonus,totalsalary;
	printf("enter the basic salary = ");
	scanf("%d",&basicsalary);
	printf("enter designation like m,c,p = ");
	fflush(stdin);
	scanf("%c",&designation);
	
	if(designation=='m'){
		printf("\n designation = manager");
		bonus=0.45f*basicsalary;
	}else if(designation=='c'){
		printf("\n designation = clerk");
		bonus=0.35f*basicsalary;
	}else if(designation=='p'){
		printf("designation = peon");
		bonus=0.15f*basicsalary;
	}
	printf("\n basic salary = %d",basicsalary);
	printf("\n bonus =%0.2f",bonus);
	totalsalary=bonus+basicsalary;
	printf("\n total salary =%0.2f",totalsalary);
}

