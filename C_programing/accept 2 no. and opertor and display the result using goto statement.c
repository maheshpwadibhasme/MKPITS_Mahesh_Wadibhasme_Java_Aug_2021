//5-wap to accept 2 no. and opertor and display the result using goto statement.
#include<stdio.h>
int main(){
	int n1,n2,res;
	char op;
	printf("enter 2 no:-");
	scanf("%d%d",&n1,&n2);
	
	fflush(stdin);
	
	printf("enter a operater like +-*");
	scanf("%c",&op);
	
	if(op =='+'){
		goto add;
	}
	else if(op =='-'){
		goto sub;
	}
	else if(op =='*'){
		goto mul;
	}
	else {
		printf("\n invalid operater");
		goto end;
	}
	add:
		res=n1+n2;
		goto end;
		
	sub:
		res=n1-n2;
		goto end;
		
	mul:
		res=n1*n2;
		goto end;
		
	end:
		printf("\n result=%d",res);
}