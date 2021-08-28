//2- wap to create a function sum to accept 2 no. and display the addition of 2 no.
// wap to create a function sum to accept 2 no. and display the addition of 2 no.
//creating a function sum
#include<stdio.h>
void sum(){
	int n1,n2,result;
	printf("enter the number:-");
	scanf("%d%d",&n1,&n2);
	result=n1+n2;
	printf("sum of 2 number=%d",result);
}
int main(){
	sum();
	printf("\n bye from main function");
}