//4-create a 2d of 2 rows and 2cols and accept the values from the user and store it in an array
//and then display it.
#include<stdio.h>
int main(){
	int arr[2][2];
	int row,col;
	for(row=0;row<2;row++){
		for(col=0;col<2;col++){
			printf("enter no");
			scanf("%d",&arr[row][col]);
		}
	}
	for(row=0;row<2;row++){
		for(col=0;col<2;col++){
			printf("\t %d",arr[row][col]);
		}
		printf("\n");
	}
}

