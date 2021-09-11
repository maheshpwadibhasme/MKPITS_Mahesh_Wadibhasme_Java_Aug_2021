//7- wap to accept basicsal and designation and calculate 
//hra 12% of basic for m, hra=5% of basic for c, hra =8% of basic for p
//calculate total =hra + basic
#include<stdio.h>
int main(){
	int basicsal;
	float hra,total;
	char designation;
	printf("enter basic salary = ");
	scanf("%d",&basicsal);
	printf("\n enter designation like m,c,p = ");
	fflush(stdin);
	scanf("%c",&designation);
	
	switch(designation){
		case'm':
			hra=0.12f*basicsal;
			break;
		case'c':
			hra=0.05f*basicsal;
			break;
		case'p':
			hra=0.08f*basicsal;
			break;
		default:
			printf("\n not valid designation ");
			
	}
	total=hra+basicsal;
	printf("\n hra =%0.2f",hra);
	printf("\n total =%0.2f",total);
}
