//5- wap to accept and display name using gets and puts function.
#include<stdio.h>
int main(){
	char name[20];
	printf("enter name=");
	fflush(stdin);
	gets(name);
	puts(name);
}