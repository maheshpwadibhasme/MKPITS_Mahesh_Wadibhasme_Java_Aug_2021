//2- Write a C program to check whether a given number is even or odd.

#include<stdio.h>
void main(){
	int num;
	printf("ente number");
	scanf("%d",&num);
	if(num%2){
		printf("number is odd");
	}else{
		printf("number is even");
	}
}