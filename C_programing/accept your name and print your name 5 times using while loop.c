//1- wap to accept your name and print your name 5 times using while loop
#include<stdio.h>
int main(){
	int i=1;
	char name[20];
	printf("enter name = ");
	scanf("%s",&name);
	while(i<=5){
		printf("\n name = %s",name);
		i++;
	}
	printf("\n bye");
}
