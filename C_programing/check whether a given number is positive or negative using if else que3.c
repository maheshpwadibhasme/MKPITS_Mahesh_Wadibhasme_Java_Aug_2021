//3- Write a C program to check whether a given number is positive or negative

#include<stdio.h>
int main(){
	int num;
	printf("enter number:");
	scanf("%d",&num);
	if(num<0){
		printf("number is nigative");
	}else{
		printf("number is positive");
	}
}