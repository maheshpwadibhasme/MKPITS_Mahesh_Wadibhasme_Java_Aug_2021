//2 -create a array of 3 elements and pass it to the funtion display
//using for loop to display array elements
#include<stdio.h>
int main(){
	int arr[3]={3,2,1};
	display(arr);
}
void display(int arr[]){
	int i;
	for(i=0;i<3;i++){
		printf("arr[i]=%d",i,arr[i]);
	}
}
