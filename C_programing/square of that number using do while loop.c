//wap to accept a number and print square of that number 

#include<stdio.h>
int main(){
	int num,square;
	char ans;
	do {
		printf("\n enter the number=");
		scanf("%d",&num);
		square=num*num;
		printf("\n square of number=%d",square);
		printf("\n do you want to continue if yes press y otherwise n");
		fflush(stdin);
		scanf("%c",&ans);
	} while(ans=='y');
		printf("\n bye");
}