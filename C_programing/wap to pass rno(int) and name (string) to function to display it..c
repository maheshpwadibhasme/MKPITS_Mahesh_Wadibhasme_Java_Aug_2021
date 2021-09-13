//wap to pass rno(int) and name (string) to function to display it.
#include<stdio.h>
int main(){
	int rno = 21;
	char name[] = "mahesh";
	display(rno,name);
}
void display(int rno,char *ch){
	printf("\n roll no. =%d",rno);
	printf("\n name = %s",ch);
}
