//create a structure array of 10 element of struture product.
struct product{
	int prodprice;
	char prodname[20];
	char prodcolor[20];
};
void display(struct product p1);
#include<stdio.h>
int main(){
	struct product p[3];
	int i=0;
	while(i<3){
		printf("\n enter name of product = ");
		fflush(stdin);
		scanf("%s",&p[i].prodname);
		printf("enter product color = ");
		fflush(stdin);
		scanf("%s",&p[i].prodcolor);
		printf("enter product price =");
		scanf("%d",&p[i].prodprice);
		printf("\n--------------product[%i]details are------------------",i+1);
		display(p[i]);
		printf("\n___________________________________________",i+1);
		i++;
	}
}
void display(struct product p1){
	printf("\n name of product =%s",p1.prodname);
	printf("\n color of product=%s",p1.prodcolor);
	printf("\n price of product =%d",p1.prodprice);
}
