//1- wap to accept 2 no. and display the smallest no.
#include<stdio.h>
int main(){
	int num1,num2;
	printf("enter number 1 =");
	scanf("%d",&num1);
	printf("enter number 2 =");
	scanf("%d",&num2);
	if(num1>num2){
		printf("number 2 is smallest");
	} if(num1==num2){
		printf("both number are same");
	}
	else{
		printf("number 1 is smallest");
	}
}
