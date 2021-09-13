//wap to accept a no. and then print whether it is prime no. or not using while loop
#include<stdio.h>
int main(){
	int num,i=1,count=0;
	printf("\ enter number = ");
	scanf("%d",&num);
	while(i<=num){
		if(num%i==0){
			count++;
	    }
			i++;
	}
		if(count==2){
		printf("\n prime number");
		}else{
			printf("\n not prime number");
		}
	
}
