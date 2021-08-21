//wap to print primeno. between 1 and 20 using for loop.

#include<stdio.h>
int main(){
	int i,num,count;
	printf("prime no. between 1to20:-");
	
	for(num=1;num<=20;num++){
		count=0;
		for(i=1;i<=num/2;i++){
		
		if(num%i==0){
			count++;
			break;
		}
		}
		if(count==0 && num!=1){
		printf("%d",num);
	}
	}
}