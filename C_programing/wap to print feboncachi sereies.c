//12 - wap to print feboncachi sereies
//output:-0 1 1 2 3 5 8 13
#include<stdio.h>
int main(){
	int i=1,num,a=-1,b=1,c;
	printf("enter number = ");
	scanf("%d",&num);
	while(i<=num){
		c=a+b;
		printf("%d",c);
		
		a=b;
		b=c;
		i++;
	}
}

