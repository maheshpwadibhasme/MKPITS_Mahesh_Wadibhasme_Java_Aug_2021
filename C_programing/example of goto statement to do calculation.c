//4-example of goto statement to do calculation.
#include<stdio.h>
int main(){
	int n1,n2,res;
	char op;
	printf("enter 2 no:-");
	scanf("%d%d",&n1,&n2);
	
	fflush(stdin);
	
	printf("enter a operater like +-* ");
	scanf("%c",&op);
	
	if(op=='+'){
		goto add;
	}
	
	add:
		printf("\n addition");
		goto end;
		
	sub:
		printf("\n substraction");
		
	mul:
		printf("\n multiplication");
		
	end:
		printf("\n bye");
}