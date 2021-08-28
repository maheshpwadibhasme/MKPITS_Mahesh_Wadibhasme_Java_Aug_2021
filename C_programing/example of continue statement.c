//2-example of continue statement
#include<stdio.h>
int main(){
	int i=0;
	while(i<5){
		i++;
		if (i==3){
			continue;
		}
		printf("\n i=%d",i);
	}
	printf("\n out of while loop");
}