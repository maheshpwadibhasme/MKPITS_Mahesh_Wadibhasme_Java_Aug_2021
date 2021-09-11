//4 - wap to accept designation like m,p,c and display the full designation.
#include<stdio.h>
int main(){
	char designation;
	printf("Enetr designation like m,p,c = ");
	fflush(stdin);
	scanf("%c",&designation);
	switch(designation){
		case'm':
			printf("\n manager");
			break;
		case'p':
			printf("\n peon");
			break;
		case'c':
			printf("\n clerk");
			break;
		default:
			printf("\n not valid designation");
			break;
	}
}
