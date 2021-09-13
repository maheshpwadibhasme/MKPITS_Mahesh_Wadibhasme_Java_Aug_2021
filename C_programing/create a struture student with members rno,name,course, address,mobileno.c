//2 -create a struture student with members rno,name,course, address,mobileno
#include<stdio.h>
struct student{
	int rno;
	long long int mobileno;
	char name[20];
	char course[20];
	char address[20];
}s1;
int main(){
	s1.rno=12;
	printf("\n roll no = %d",s1.rno);
	s1.mobileno=7030486117;
	printf("\n mobile no =%lld",s1.mobileno);
	strcpy(s1.name,"mahesh");
	printf("\n name = %s",s1.name);
	strcpy(s1.course,"java");
	printf("\n course = %s",s1.course);
	strcpy(s1.address,"bhojapur");
	printf("\n address = %s",s1.address);
}
