//Once a string is defined, it cannot be reassigned to another set of characters. However, 
//using pointers, we can assign the set of characters to the string. Consider the following example.
#include<stdio.h>
void main(){
	char *p="hello mahesh";
	printf("before assigning:%s\n",p);
	p="hello";
	printf("after assigning:%s\n",p);
}
