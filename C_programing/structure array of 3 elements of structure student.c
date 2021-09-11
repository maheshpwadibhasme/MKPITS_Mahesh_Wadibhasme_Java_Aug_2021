//11- wap to create a structure array of 3 elements of structure student
//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
struct student{
	int rno;
	char name[20];
	char address[20];
};
void display (struct student s1);
#include<stdio.h>
int main(){
	struct student stud[3];
	int i=0;
	while(i<3){
		printf("\n Enter roll no.= ");
		scanf("%d",&stud[i].rno);
		printf("Enter student name= ");
		fflush(stdin);
		scanf("%s",&stud[i].name);
		printf("Enter address= ");
		fflush(stdin);
		gets(stud[i].address);
		printf("\n detials of stud[%d] are",i+1);
		display(stud[i]);
		i++;
	}
}
void display(struct student s1){
	printf("\n roll no.=%d",s1.rno);
	printf("\n name =%s",s1.name);
	printf("\n address =%s",s1.address);
	printf("\n-----------------------------------\n");
}
