//5- Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote
#include<stdio.h>
int main(){
	int age;
	printf("Enter a age of candidate:-");
	scanf("%d",&age);
	if(age>18){
		printf("his eligible for vote");
	}else{
		printf("his not eligible for vote");
	}
}