//8- create a structure student and accept values from the user.
#include<stdio.h>
struct student{
	int studentrno;
	char studentname[20];
	char address[20];
}s1;
int main(){
	printf("enter student roll no = ");
	scanf("%d",&s1.studentrno);
	printf("enter student name =");
	scanf("%s",&s1.studentname);
	printf("enter student address =");
	scanf("%s",&s1.address);
	
	printf("\n student roll no =%d",s1.studentrno);
	printf("\n student name =%s",s1.studentname);
	printf("\n student address =%s",s1.address);
}
