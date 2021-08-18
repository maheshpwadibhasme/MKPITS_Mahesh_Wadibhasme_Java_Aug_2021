//wap to accept length and breadth and height and print volume

#include<stdio.h>
void main(){
	int volume,length,breadth,height;
		printf("enter length,breadth and height");
		scanf("%d%d%d",&length,&breadth,&height);
		volume = length*breadth*height;
		printf("\n volume=%d",volume);
}