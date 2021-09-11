// create a structure book with members bookid, title, author and price.
#include<stdio.h>
struct book{
	int bookid;
	char title[20];
	char author[20];
	float price;
};
int main(){
	struct book b1;
	b1.bookid=123;
	strcpy(b1.title,"oracle");
	strcpy(b1.author,"bill");
	b1.price=52.4f;
	
	printf("\n book id=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
	printf("\n price=%f",b1.price);
}
