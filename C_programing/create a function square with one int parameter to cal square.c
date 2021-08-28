// 4-wap to create a function square with one int parameter to accept a number and calculate 
//and display the square of that no.
#include<stdio.h>
void square(int n1){
	int square;
	square=n1*n1;
	printf("square of number=%d",square);
}
int main(){
	int n1=2;
	square(n1);
	printf("\n bye from main function");
}