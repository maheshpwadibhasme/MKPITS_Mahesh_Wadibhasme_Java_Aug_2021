//wap to print this pattern   
//	                     	* 	*	*	*	
//		                    *	*	*
//		                    *	*
// 		                    *

#include<stdio.h>
int main(){
	int row,col;
	for(row=5;row>0;row--){
		for(col=1;col<=row;col++){
			printf("\t*");
		}
		printf("\n");
	}
}