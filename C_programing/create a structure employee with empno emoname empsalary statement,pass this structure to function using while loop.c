//create a structure employee with empno emoname empsalary statement,pass this structure to function .
struct employee{
	int empno,empsalary;
	char empname[20];
};
void display(struct employee e1);
#include<stdio.h>
int main(){
	struct employee emp[3];
	int i=0;
	while(i<3){
		printf("\n enter employee no. =");
		scanf("%d",&emp[i].empno);
		printf(" enter employee name =");
		scanf("%s",&emp[i].empname);
		printf(" enter employee salary =");
		scanf("%d",&emp[i].empsalary);
		printf("\n----------------employee[%i]details are--------------",i+1);
		display(emp[i]);
		printf("\n-----------------------------------------------------",i+1);
		i++;
	}
}
void display(struct employee e1){
	float hra,da,totalsalary;
	printf("\n employee no. =%d",e1.empno);
	printf("\n employee name=%s",e1.empname);
	printf("\n employee salary =%d",e1.empsalary);
	hra=0.35f*e1.empsalary;
	da=0.45f*e1.empsalary;
	totalsalary=hra+da+e1.empsalary;
	printf("\n hra =%.0f",hra);
	printf("\n da =%.0f",da);
	printf("\n total salary =%.0f",totalsalary);
}
