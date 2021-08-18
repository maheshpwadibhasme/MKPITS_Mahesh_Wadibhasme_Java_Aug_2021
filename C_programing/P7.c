//wap to accept length and breadth of a rectangle and then print 
//area of rectangle=length*breadth

#include<stdio.h>
void main(){
	int length,breadth,area;
	printf("enter the length:-");
	scanf("%d",&length);
	printf("enter the breadth:-");
	scanf("%d",&breadth);
	area=length*breadth;
	printf("\n area of rectangle:-%d",area);
}