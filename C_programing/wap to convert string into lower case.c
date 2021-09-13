//-strlwr() function
//wap to convert string into lower case
#include<string.h>
int main(){
	char name[30];
	printf("enter name = ");
	gets(name);
	strlwr(name);
	printf("\n name in lower case =%s",name);
	strupr(name);
	printf("\n name in upper case =%s",name);
}
