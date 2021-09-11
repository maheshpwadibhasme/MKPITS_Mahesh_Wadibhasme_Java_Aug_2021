//11 - wap to accept a no. and then print whether it is prime no. or not.
#include<stdio.h>
int main(){
	int num;
	printf("enter number : ");
	scanf("%d",&num);
	if(num%2!=0){
		printf("no is prime");
	}else{
		printf("no is not prime");
	}
}
