//8 -Write a C program to read roll no, name and marks of three subjects and calculate the total,
// percentage and division.
#include<stdio.h>
int main(){
	int rollno,s1,s2,s3,total;
	float percentage;
	char name;
	printf("enter a roll no:-");
	scanf("%d",&rollno);
	
	printf("enter a name:-");
	scanf("%s",&name);
	
	printf("enter a marks of subject 1:- ");
	scanf("%d",&s1);
	
	printf("enter a marks of subject 2:- ");
	scanf("%d",&s2);
	
	printf("enter a marks of subject 3:- ");
	scanf("%d",&s3);
	
	total=s1+s2+s3;
	printf("\n total marks of 3 subject:- %d \n",total);
	
	percentage=(float)(total/300.2f)*100.2f;
	printf("\n percentage:- %.2f%% \n",percentage);
	
	if(percentage>75){
		printf("\n First division\n");
	}else if(percentage>=60 && percentage<=75){
		printf("\n Second division \n");
	}else{
		printf("\n Third division \n");
	}
}