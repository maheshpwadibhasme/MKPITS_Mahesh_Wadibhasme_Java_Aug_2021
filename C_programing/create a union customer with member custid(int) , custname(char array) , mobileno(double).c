//7 create a union customer with member custid(int) , custname(char array) , mobileno(double)
#include<stdio.h>
union coustomer{
	int cusid;
	char custname[20];
	double mobileno;
}c1;
int main(){
	printf("\n Enter customer id = ");
	scanf("%d",&c1.cusid);
	printf("coustomer id =%d \n",c1.cusid);
	
	printf("\n Enter customer name =");
	scanf("%s",&c1.custname);
	printf("coustomer name =%s \n",c1.custname);
	
	printf("\n Enter mobile no. =");
	scanf("%lf",&c1.mobileno);
	printf("coustomer mobile no.= %0.0lf \n",c1.mobileno);
}
