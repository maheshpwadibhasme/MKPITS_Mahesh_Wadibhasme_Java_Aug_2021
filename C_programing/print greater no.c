//wap to accept two no. and print greater no.

#include<stdio.h>
	int main(){
		int n1,n2;
		printf("enter two no.");
		scanf("%d%d",&n1,&n2);
		if(n1>n2){
			printf("\n n1 is greater ");
		}
		else{
			printf("\n n2 is greater");
		}
	}