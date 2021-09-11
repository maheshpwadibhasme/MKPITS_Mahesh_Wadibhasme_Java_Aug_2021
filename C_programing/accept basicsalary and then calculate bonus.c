//6 - wap to accept basicsalary and then calculate bonus
//( bonus =1000 if salary > 10000, bonus=500 if salary > 5000 or bonus=100)
#include<stdio.h>
int main(){
	int basicsalary,bonus;
	printf("Enter basic salary = ");
	scanf("%d",&basicsalary);
	
	if(basicsalary>=10000){
		bonus=1000;
	}else if(basicsalary>=5000 && basicsalary<10000){
		bonus=500;
	}else{
		bonus=100;
	}
	printf("\n bonus =%d ",bonus);
}
