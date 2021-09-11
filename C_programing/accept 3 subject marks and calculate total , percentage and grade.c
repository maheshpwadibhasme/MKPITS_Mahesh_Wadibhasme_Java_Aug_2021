//5- wap to accept 3 subject marks and calculate total , percentage and grade
#include<stdio.h>
int main(){
	int s1,s2,s3,total;
	float per;
	char grade;
	printf("\n Enter 3 subject marks = ");
	scanf("%d%d%d",&s1,&s2,&s3);
	total = s1+s2+s3;
	printf("\n total marks in 3 subjects = ",total);
	per=(float)total/300.0f*100.0f;
	printf("\n percentage = ",per);
}
