//6 wap to accept empno,firstname , lastname, designation and salary of the employee and display it.
#include<stdio.h>
int main(){
	int empno;
	char firstname[20];
	char lastname[20];
	char designation[20];
	float salary;
	printf("Enter Employee no.=");
	scanf("%d",&empno);
	
	printf("Enter first name =");
	fflush(stdin);
	gets(firstname);
	
	printf("Enter last name =");
	fflush(stdin);
	gets(lastname);
	
	fflush(stdin);
	printf("Enter designation =");
	gets(designation);
	
	printf("Enter salary =");
	scanf("%f",&salary);
	
	printf("\n Employee details are:-");
		printf("\n Employee no.=%d",empno);
			printf("\n first name =%s",firstname);
				printf("\n last name =%s",lastname);
					printf("\n Designation =%s",designation);				
						printf("\n salary =%f",salary);
						
}
                           
                                      