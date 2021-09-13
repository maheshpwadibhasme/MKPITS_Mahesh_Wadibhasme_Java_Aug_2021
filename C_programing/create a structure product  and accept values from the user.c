//7 - create a structure product  and accept values from the user
#include<stdio.h>
struct {
	int productno,productprice;
	char productname[20];
}p1;
int main(){
	printf(" enter productno = ");
	scanf("%d",&p1.productno);
	printf(" enter name = ");
	fflush(stdin);
	scanf("%s",&p1.productname);
	printf(" enter product price = ");
	scanf("%d",&p1.productprice);
	
	printf("\n product no =%d",p1.productno);
	printf("\n product name =%s",p1.productname);
	printf("\n product price =%d",p1.productprice);
}
