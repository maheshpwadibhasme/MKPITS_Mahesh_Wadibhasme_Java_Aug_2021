//1- create a union data with 3 member (int i, float j, char n[10])
#include<stdio.h>
union data{
	int i;
	float j;
	char name[10];
}d1;
int main(){
	d1.i=10;
	printf("\n value of i=%d",d1.i);
	d1.j=20.43f;
	printf("\n value of j=%0.2f",d1.j);
	strcpy(d1.name,"mahesh");
	printf("\n name= %s",d1.name);
	printf("\n now value of i = %d",d1.i); // it will print garbage value
}
