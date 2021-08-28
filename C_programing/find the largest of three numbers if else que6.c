//6-Write a C program to find the largest of three numbers
#include<stdio.h>
int main(){
	int n1,n2,n3;
	printf("Enter a three number:-");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3){
		printf("%d is greater",n1);
	}else if(n2>n1 && n2>n3){
		printf("%d is greater",n2);
	}else if(n3>n1 && n3>n2) {
		printf("%d is greater",n3);
	}
}
