//wap to convert string into upper case
#include<string.h>
int main(){
	char name[20];
	printf("Enter name = ");
	gets(name);
	strupr(name);
	printf("\n name in upper case =%s",name);
}
