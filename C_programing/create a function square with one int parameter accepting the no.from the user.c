//5 - repeat the above program with accepting the no. from the user.
// wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
#include<stdio.h>
void square(int n1){
	int square;
		square=n1*n1;
		printf("\n square of no=%d \n",square);
}
int main(){
	int n1;
	printf("\n enter a no=");
	scanf("%d",&n1);
	square(n1);
	printf("\n bye from main function\n");
}