//wap to add two string using strcat function
#include<stdio.h>
#include<string.h>
int main(){
	char firstname[15];
	char lastname[15];
	printf("enter firstname = ");
	gets(firstname);
	printf("enter lastname = ");
	gets(lastname);
	strcat(firstname,lastname);
	printf("name= %s",firstname);
}
