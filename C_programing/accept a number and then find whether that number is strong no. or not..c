//accept a number and then find whether that number is strong no. or not.
#include<stdio.h>
int main(){
	int num = 145;
	int originalnum = num;
	int rem;
	int fact;
	int sum=0;
	while(num!=0)
	{
	rem=num% 10;
	printf("\n remender=%d",rem);
	num=num/10;
	printf("\n num=%d",num);
	fact=factorial(rem);
	sum=sum+fact;	
	}
		if(originalnum=sum)
		{
			printf("\n no[%d] is strong number",originalnum);
		}else
		{
			printf("\n no[%d] is not strong number",originalnum);
		}
}
	int factorial(int r){
		int f=1;
		while(r>0)
		{
			f=f*r;
			r=r-1;
		}
		return f;
	}
