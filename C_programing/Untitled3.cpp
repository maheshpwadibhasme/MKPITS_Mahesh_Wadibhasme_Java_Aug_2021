//4- create a structure product with productid,productname,productprice.
#include<stdio.h>
struct product{
	int productid,productprice;
	char productname[20];
};
int main(){
	struct product p1;
	
	p1.productid=102;
	p1.productprice=2000;
	strcpy(p1.productname,"cooler");
	
	printf("product id = %d",p1.productid);
	printf("product name =%s",p1.productname);
	printf("product price =%d",p1.productprice);
}
