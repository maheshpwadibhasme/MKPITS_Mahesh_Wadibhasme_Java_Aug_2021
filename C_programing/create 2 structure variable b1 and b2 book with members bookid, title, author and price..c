// create 2 structure variable b1 and b2 book with members bookid, title, author and price.
struct book{
	int bookid;
	char title[20];
	char author[20];
	float price;
}b1,b2;
int main(){
	b1.bookid=123;
	strcpy(b1.title,"oracle");
	strcpy(b1.author,"bill");
	b1.price=65.8;
	printf("\n book 1 details \n");
	 printf("\n book id= %d",b1.bookid);
	 printf("\n title= %s",b1.title);
	 printf("\n author= %s",b1.author);
	 printf("\n price= %f",b1.price);
	 
	
	b2.bookid=23;
	strcpy(b2.title,"java");
	strcpy(b2.author,"mahesh");
	b2.price=65.8; 
	 printf("\n book 2 details \n");
	 printf("\n book id= %d",b2.bookid);
	 printf("\n title= %s",b2.title);
	 printf("\n author= %s",b2.author);
	 printf("\n price= %f",b2.price);
}
