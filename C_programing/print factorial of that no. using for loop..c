//wap to accept a no. and print factorial of that no. using for loop.

#include<stdio.h>
int main(){
	int num,fact=1,i;
	printf("enter number=");
	scanf("%d",&num);
		for(i=num;i>0;i--){
			fact=fact*i;
}  
   printf("\n fact=%d",fact);
}