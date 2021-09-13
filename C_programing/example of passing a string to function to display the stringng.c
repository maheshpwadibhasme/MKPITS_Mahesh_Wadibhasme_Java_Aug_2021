//8 - example of passing a string to function to display the string
#include<stdio.h>
int main(){
	char name[20]="mahesh";
	display(name);
}
void display(char *ch){
	printf("%s",ch);
}
