//1. Write a C program to accept two integers and check whether they are equal or not.

#include<stdio.h>
void main(){
	int num1,num2 ;
	printf("enter number two no:-");
	scanf("%d%d",&num1,&num2);
	if(num1==num2){
		printf("two no. are equal");
	} 
	else {
		printf("two no. are not equal");
	}
}