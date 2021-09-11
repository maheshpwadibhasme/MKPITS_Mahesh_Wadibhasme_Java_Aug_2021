//3- wap to accept 2 no. and operator like +,-,* and then print the result using switch statement.
#include<stdio.h>
int main(){
	int num1,num2,result;
	char op;
	printf("\n enter two no = ");
	scanf("%d%d",&num1,&num2);
	printf("\n enter operator like +,-,* =");
	fflush(stdin);
	scanf("%c",&op);
	switch(op){
		case '+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
		case'%':
			result=num1%num2;
			break;
		default:
			printf("\n not valid operator");
			break;
	}
	printf("\n result = %d",result);
}
