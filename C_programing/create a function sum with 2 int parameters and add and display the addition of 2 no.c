//6 - wap to create a function sum with 2 int parameters and write code in it
// to add and display the addition of 2 no.
#include<stdio.h>
void sum(int n1,int n2){
	int result=n1+n2;
	printf("\n addition of 2 no.=%d",result);
	
}
int main(){
	int n1,n2;
	printf("enter 2 no.=");
	scanf("%d%d",&n1,&n2);
	sum(n1,n2);
	printf("\n bye from main function");
}