//wap to compare two string
#include<string.h>
#include<stdio.h>
int main(){
	char firstname[20];
	char lastname[20];
	printf("enter firstname = ");
	gets(firstname);
	printf("enter lastname = ");
	gets(lastname);
	if(strcmp(firstname,lastname)==0){
		printf("\n both string are same");
	}else{
		printf("\n both string are not same");
	}
}
