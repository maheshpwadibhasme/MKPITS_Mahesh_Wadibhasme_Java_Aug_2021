//5 -example of union by acception values from the user.
#include<stdio.h>
union data{
	long int i;
	float j;
	char name[20];
}d1;
int main(){
	printf("\n Enter value of i(int value)");
	scanf("%ld",&d1.i);
	printf(" value of i =%d \n",d1.i);
	printf("\n Enter value of j(float value)");
	scanf("%f",&d1.j);
	printf(" value of j =%f \n",d1.j);
	printf("\n Enter name(char name)");
	scanf("%s",&d1.name);
	printf("name =%s \n",d1.name);
	
	
}
