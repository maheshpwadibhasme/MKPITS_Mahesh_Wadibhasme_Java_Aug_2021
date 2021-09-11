//7- wap to accept 2 no. and operator like +,-,* and then display the result.
#include<stdio.h>
int main(){
	int num1,num2;
	float result;
	char op;
	printf("enter two no. = ");
	scanf("%d%d",&num1,&num2);
	printf("enter operator like +,-,* ");
	fflush(stdin);
	scanf("%c",&op);
	if(op=='+'){
		result=num1+num2;
	}else if(op=='-'){
		result=num1-num2;
	}else if(op=='*'){
		result=num1*num2;
	}else if(op=='/'){
		result=num1/num2;
	}
	else{
		printf("invalid operator");
	}
	printf("result = %0.2f",result);
}
