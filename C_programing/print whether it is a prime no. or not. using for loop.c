//wap to accept a no. and print whether it is a prime no. or not.

#include<stdio.h>
int main(){
	int num,result,i;
	printf("enter number");
	scanf("%d",&num);
	for(i=2;i<num;i++){
		if(num%2==0){
			printf("\n not a prime no.");
			break;
		}
	}
		if(i==num){
			printf("\n no. is prime");
		}
}