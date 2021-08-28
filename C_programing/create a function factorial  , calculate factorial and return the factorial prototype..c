//12 - wap to create a function factorial  , calculate factorial and return the factorial.
#include<stdio.h>
float calculatearea();
int main(){
	float result;
	result=calculatearea();
	printf("area=%0.2f",result);
}
float calculatearea(){
	int radius;
	float area;
	printf("enter a radius=");
	scanf("%d",&radius);
	area=3.14*radius*radius;
	return area;
}