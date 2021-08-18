//wap to accept age and print whether he is minor, young or old

#include<stdio.h>
void main(){
	int age;
	printf("enter the age:-");
	scanf("%d",&age);
	if(age<18){
		printf("hi is an minor");
	}
	else if(age>18){
		printf("hi is an young");
	}
	else {
		printf("hi is an old");
	}
}