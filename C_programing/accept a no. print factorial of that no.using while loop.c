//8 - wap to accept a no. print factorial of that no. using while loop.
#include<stdio.h>
int main(){
	int num, fact=1;
	printf("enter number = ");
	scanf("%d",&num);
	while(num>0){
		fact=fact*num;
		num--;
	}
	printf("\n factorial of no = %d",fact);
}
