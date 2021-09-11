//10 - wap to accept a number and print from 1 to the number entered by the user using while loop.
#include<stdio.h>
int main(){
	int num;
	int i=1;
	printf("enter number = ");
	scanf("%d",&num);
	while(i<=num){
		printf("\n %d",i);
		i++;
	}
}
