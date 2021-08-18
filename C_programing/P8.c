//wap to accept radius of circle and print area and circumferance of circle
// area = 3.14 * radius * radius
// circ = 2 * 3.14 * radius
#include<stdio.h>
void main(){
	int radius,area;
	float circ;
	printf("enter the radius:-");
	scanf("%d",&radius);
	area = 3.14 * radius * radius;
	circ = 2 * 3.14 * radius;
	printf("\n area of circle:-%d",area);
	printf("\n circ of circle:-%d",circ);
}