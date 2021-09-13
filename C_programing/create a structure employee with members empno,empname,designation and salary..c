//3- create a structure employee with members empno,empname,designation and salary.
#include<stdio.h>
struct employee{
	int empno,salary;
	char empname[20],designation[20];
}e1;
int main(){
	printf(" enter employee no = ");
	scanf("%d",&e1.empno);
	printf("enter employee name = ");
	fflush(stdin);
	scanf("%s",&e1.empname);
	printf("enter designation = ");
	fflush(stdin);
	scanf("%s",&e1.designation);
	printf(" enter salary = ");
	scanf("%d",&e1.salary);
	
//	e1.empno=45;
//	e1.salary=50000;
//	strcpy(e1.empname,"mahesh");
//	strcpy(e1.designation,"engineer");
	printf("-------------------------------------\n ");
	printf("\ employee no = %d",e1.empno);
	printf("\n employee name = %s",e1.empname);
	printf("\n designation = %s",e1.designation);
	printf("\n salary = %d",e1.salary);
}
