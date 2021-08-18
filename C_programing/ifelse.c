//wap to accept age and print whether he is elegible to vote or not

#include<stdio.h>
void main(){
	int age;
	printf("enter the age:-");
	scanf("%d",&age);
	if(age>18){
		printf("he is elegible to vote");
	}
	else{
		printf("he is not elegible to vote");
	}
}
