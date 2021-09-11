//creating 2 structure variables stud1 and stud2 with members rno,name and address ,
// pass this structure to function display to display structure values
#include<stdio.h>
struct student{
	int rno;
	char name[20];
	char address[20];
};
void display(struct student s1);
int main(){
	struct student stud1,stud2;
	printf("Enter roll no. =");
	scanf("%d",&stud1.rno);
	printf("Enter name =");
	fflush(stdin);
	scanf("%s",&stud1.name);
	printf("Enter address =");
	fflush(stdin);
	gets(stud1.address);
	printf("\n student1 detials are =>\n");
	display(stud1);
	printf("\n---------------------------------------------------------\n");
	printf("\nEnter student noll no. =");
	scanf("%d",&stud2.rno);
	printf("Enter name =");
	fflush(stdin);
	scanf("%s",&stud2.name);
	printf("Enter address =");
	fflush(stdin);
	gets(stud2.address);
	printf("\n student2 detials are =>\n");
	display(stud2);
}
void display(struct student s1){
	printf("\n\t\t\t roll no. =%d",s1.rno);
	printf("\n\t\t\t name =%s",s1.name);
	printf("\n\t\t\t address =%s",s1.address);
}
