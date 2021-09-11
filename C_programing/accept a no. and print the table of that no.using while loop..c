//9 wap to accept a no. and print the table of that no.using while loop.
#include<stdio.h>
int main(){
	int num,result;
	int i=1;
	printf("enter number = ");
	scanf("%d",&num);
	while(i<=10){
		result = num*i;
		printf("\n %d",result);
		i++;
	}	
}
