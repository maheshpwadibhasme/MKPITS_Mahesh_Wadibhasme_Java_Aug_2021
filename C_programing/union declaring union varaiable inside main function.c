//2 -example of union declaring union varaiable inside main function
#include<stdio.h>
union data{
	int i;
	float j;
	char name[20];
};
int main(){
	union data d1;
	d1.i=25;
	printf("\n value of i =%d",d1.i);
	d1.j=98.3f;
	printf("\n value of j =%0.2f",d1.j);
	strcpy(d1.name,"mahesh");
	printf("\n name = %mahesh",d1.name);
	
	printf("\n value of i =%d",d1.i);
}
