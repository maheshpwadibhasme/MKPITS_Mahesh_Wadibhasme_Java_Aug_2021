//wap to accept 3 numbers and print total and average

#include<stdio.h>
void main(){
	int n1,n2,n3,total;
	float average;
	printf("enter three no:-");
	scanf("%d%d%d",&n1,&n2,&n3);
	total=n1+n2+n3;
	average=(total/3);
	printf("\n total:-%d",total);
	printf("\n average:-%f",average);
}