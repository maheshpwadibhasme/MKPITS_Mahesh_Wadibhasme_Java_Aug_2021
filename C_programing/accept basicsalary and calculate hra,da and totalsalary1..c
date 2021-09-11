//4-  wap to accept basicsalary and calculate hra,da and totalsalary.
//(hra=45% of basicsalary,da=55% of basicsalary if basicsalary >=10000)
//(hra=25% of basicsalary,da=35% of basicsalary if basicsalary >=5000)
//(hra=15% of basicsalary,da=5% of basicsalary if basicsalary < 5000)
#include<stdio.h>
int main(){
	int basicsalary;
	float hra,da,totalsalary;
	printf("enter basic salary = ");
	scanf("%d",&basicsalary);
	if(basicsalary>=10000){
		hra=0.45f;
		da=0.55f;
	}else if(basicsalary >=5000){
		hra=0.25f;
		da=0.35f;
	}else if(basicsalary >=500){
		hra=0.15f;
		da=0.5f;
	}
	printf("basic salary = %d",basicsalary);
	hra=hra*basicsalary;
	printf("\n hra = %0.2f",hra);
	da=da*basicsalary;
	printf("\n da = %0.2f",da);
	totalsalary=(hra+da+basicsalary);
	printf("\n total salary =%0.2f",totalsalary);
}
