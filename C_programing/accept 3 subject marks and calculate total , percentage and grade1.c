//5- wap to accept 3 subject marks and calculate total , percentage and grade
#include<stdio.h>
int main(){
	int s1,s2,s3;
	int total;
	float per;
	char grade;
	printf("\n Enter 3 subject marks = ");
	scanf("%d%d%d",&s1,&s2,&s3);
	total = s1+s2+s3;
	per=(float)total/300.0f*100.0f;
	printf("\n total marks in 3 subjects =%d ",total);
	printf("\n percentage =%0.2f ",per);  
	if(per>75){
		printf("\n grade = destinction");
	}else if(per>=60 && per<75){
		printf("\n grade = first class");
	}else if(per>40 && per<60) {
		printf("\n grade = second class");
	}else{
		printf("\n fail");
	}
}
