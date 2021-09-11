//3- wap to accept 5 subject marks then calclate total , per and grade.
#include<stdio.h>
int main(){
	int s1,s2,s3,s4,s5,total;
	float per;
	char grade;
	printf("enter subject 1 marks = ");
	scanf("%d",&s1);
	printf("enter subject 2 marks = ");
	scanf("%d",&s2);
	printf("enter subject 3 marks = ");
	scanf("%d",&s3);
	printf("enter subject 4 marks = ");
	scanf("%d",&s4);
	printf("enter subject 5 marks = ");
	scanf("%d",&s5);
	total=s1+s2+s3+s4+s5;
	printf("\n total marks = %d",total);
	per=(float)total/500.0f*100.0f;
	printf("\n percentage =%f",per);
	if(per>=75){
		printf("\n grade = distingtion");
	}else if(per>=60 && per<75){
		printf("\n grade = first class");
	}else if(per>=40 && per<60){
		printf("\n grade = second class");
	}else{
		printf("\n fail");
	}
}
