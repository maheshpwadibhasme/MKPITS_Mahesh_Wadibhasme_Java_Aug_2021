//program to copy one string into another
#include<stdio.h>
#include<string.h>
int main(){
	char ch[15];
	char ch1[15];
	int length;
	printf("enter string");
	gets(ch);
	strcpy(ch1,ch);
	printf("\n string1= %s",ch);
	printf("\n string2= %s",ch1);
}
