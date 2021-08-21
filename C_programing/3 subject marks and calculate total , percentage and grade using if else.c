//wap to accept 3 subject marks and calculate total , percentage and grade

#include<stdio.h>
int main(){
	int s1,s2,s3,total;
	float percentage;
	printf(" enter 3 subject marks:-\n");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("\n total=%d",total);
	percentage=(total/300.0f)*100.0f;
	printf("\n percentage=%.2f",percentage);
	
}