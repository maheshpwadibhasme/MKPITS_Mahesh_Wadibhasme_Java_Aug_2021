//1- wap to search an element in an array.(create a array of 5 elements and store 5 numbers in it ,
//then accept a number from the user and find whether that no. is in an array or not)c
#include<stdio.h>
int main(){
	int arr[5]={1,2,3,4,5};
	int i,num;
	printf("enter no. to be searched");
	scanf("%d",&num);
	for(i=0;i<5;i++){
		if(num==arr[i]){
			printf("number found at element[%d]",num-1);
			break;
		}
	}
		if (i==5){
			printf("\n number not found in an array");
		}
}
