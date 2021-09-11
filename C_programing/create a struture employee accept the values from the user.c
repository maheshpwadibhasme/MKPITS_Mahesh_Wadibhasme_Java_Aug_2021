//6 - create a struture employee with members empid, empname , designation , salary
//accept the values from the user to store employee record in structure.then display.
 #include<stdio.h>
 struct employee{
 	int empid;
 	char empname[20];
 	char designation[20];
 	float salary;
 };
 
int main(){
	struct employee emp1;
	printf("\n Enter employee id =");
	scanf("%d",&emp1.empid);
	printf("\n Enter employee name =");
	fflush(stdin);
	scanf("%s",&emp1.empname);
	printf("\n Enter designation =");
	fflush(stdin);
	scanf("%s",&emp1.designation);
	printf("\n Enter salary =");
	scanf("%f",&emp1.salary);
	
	printf("\n---------Employee 1 detials------------\n");
	printf("\n Employee id =%d",emp1.empid);
	printf("\n Employee name =%s ",emp1.empname);
	printf("\n Designation =%s",emp1.designation);
	printf("\n Salary =%f \n",emp1.salary);
}
