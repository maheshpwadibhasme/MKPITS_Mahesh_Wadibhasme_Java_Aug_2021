//5 wap to accept basicsal and designation and calculate bonus 1000 for m, 500 for c, 100 for p
#include<stdio.h>
int main(){
	int basicsalary,bonus,total;
	char designation;
	printf("enter basic salary = ");
	scanf("%d",&basicsalary);
	printf("enter designation like m,p,c =");
	fflush(stdin);
	scanf("%c",&designation);
	switch(designation){
		case 'm':
			bonus=1000;
			break;
		case 'c':
			bonus=500;
			break;
		case 'p':
			bonus=100;
			break;
		default:
			printf("\n not valid designation ");
			break;
			
	}
	total=basicsalary+bonus;
	printf("\n bonus =%d",bonus);
	printf("\n total salary =%d",total);
}
