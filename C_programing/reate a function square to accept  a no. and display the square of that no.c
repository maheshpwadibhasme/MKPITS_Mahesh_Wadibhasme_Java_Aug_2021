//3- wap to create a function square to accept  a no. and display the square of that no.
//creating a function sum
#include<stdio.h>
void square(){
	int n1,square;
	printf("enter a number:-");
	scanf("%d",&n1);
	square = n1*n1;
	printf("\n square of no=%d",square);
}
int main(){
	square();
	printf("\n bye from main function");
}