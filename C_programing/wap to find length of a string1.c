//wap to find length of a string
#include<stdio.h>
int main(){
	char ch[15];
	char ch1[15];
	int length;
	printf("enter string");
	gets(ch);
	strcpy(ch1,ch);
	printf("\n string1=%s",ch);
	printf("\n string2=%s",ch1);
}
