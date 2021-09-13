//create a structure array of 5 elements of structure book .
struct book{
	int bookid,bookprice;
	char bookname[20];
	char bookauthor[20];
};
void display(struct book b1);
#include<stdio.h>
int main(){
	struct book b[5];
	int i=0;
	while(i<5){
	printf("\n enter book id=");
	scanf("%d",&b[i].bookid);
	printf(" enter book name = ");
	fflush(stdin);
	scanf("%s",&b[i].bookname);
	printf("enter book author =");
	fflush(stdin);
	scanf("%s",&b[i].bookauthor);
	printf("enter book price = ");
	scanf("%d",&b[i].bookprice);
	printf("\n---------------book[%i]details are--------------",i+1);
	display(b[i]);
	printf("\n_________________________________________________",i+1);
	i++;
	}
}
void display(struct book b1){
	printf("\n book id =%d",b1.bookid);
	printf("\n book name =%s",b1.bookname);
	printf("\n book author =%s",b1.bookauthor);
	printf("\n book price =%d",b1.bookprice);
}
