//14 - create a structure array to produce result of student.
//create a structure student with members rno,name and marks , pass this structure to function 
//display to display structure values
#include<stdio.h>
struct student{
	int rno;
	char name[20];
	int marks1;
	int marks2;
	int marks3;
};
void display(struct student s1);
int main(){
	struct student stud[3];
	int i=0;
	while(i<3){
		printf("\n enter roll no. =");
		scanf("%d",&stud[i].rno);
		printf("\n enter name =");
		fflush(stdin);
		scanf("%s",&stud[i].name);
		printf("\n enter marks1 = ");
		scanf("%d",&stud[i].marks1);
		printf("\n enter marks2 = ");
		scanf("%d",stud[i].marks2);
		printf("\n enter marks3 = ");
		scanf("%d",stud[i].marks3);
		printf("\n---------------student[i]details are----------------",i+1);
		display (stud[i]);
		printf("\n----------------------------------------------------",i+1);
		i++;
	}
}
void display(struct student s1){
	int total;
	float per;
	printf("\n roll no =%d",s1.rno);
	printf("\n name of student =%s",s1.name);
	printf("\n marks1=%d",s1.marks1);
	printf("\n marks2=%d",s1.marks2);
	printf("\n marks3=%d",s1.marks3);
	total=s1.marks1+s1.marks2+s1.marks3;
	printf("total =%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("percentage=%0.2f",per);
}


