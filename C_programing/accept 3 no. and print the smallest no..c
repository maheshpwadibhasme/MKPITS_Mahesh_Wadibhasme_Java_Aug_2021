//2 - wap to accept 3 no. and print the smallest no.
#include<stdio.h>
int main(){
	int n1,n2,n3;
	printf("enter number 1 = ");
	scanf("%d",&n1);
	printf("enter number 2 = ");
	scanf("%d",&n2);
	printf("enter number 3 = ");
	scanf("%d",&n3);
	if(n1<n2 && n1<n3){
		printf("number 1 is smallest no. ");
	}else if(n2<n3){
		printf("number 2 is smallest no. ");
	}else{
		printf("number 3 id smallest no. ");
	}
}
