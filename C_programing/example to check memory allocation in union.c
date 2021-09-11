// 3- example to check memory allocation in union
#include<stdio.h>
union data{
	int i;
	float j;
	char name[20];
};
int main(){
	union data d1;
	printf("\n memory occupied by data=%d byte",sizeof(d1));
	d1.i=20;
	printf("\n value of i =%d",d1.i);
	d1.j=52.3f;
	printf("\n value of j =%f",d1.j);
	strcpy(d1.name,"mahesh");
	printf("\n name=%s",d1.name);
}
