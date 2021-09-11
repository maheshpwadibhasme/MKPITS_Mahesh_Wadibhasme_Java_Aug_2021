//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
#include<stdio.h>
struct student{
	int rno;
	char name[20];
	char address[20];
};
void display(struct student s1);
int main(){
	struct student s1;
	printf("Enter roll no. =");
	scanf("%d",&s1.rno);
	printf("Enter name =");
	fflush(stdin);
	scanf("%s",&s1.name);
	printf("Enter address =");
	fflush(stdin);
	gets(s1.address);
	
	printf("\n----------------student detials are ----------------\n");
	display(s1);
}
	
	void display(struct student s1){
		printf("\n rool no. =%d",s1.rno);
		printf("\n name =%s",s1.name);
		printf("\n address =%s",s1.address);
	}

