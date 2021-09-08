//6 wap to accept salary and calculate bonus and total salary using goto statement.
#include<stdio.h>
int main(){
	int sal,bonus;
	char desig;
	printf("enter salary = ");
	scanf("%d",&sal);
	fflush(stdin);
	printf("enter operator like m,p,c = ");
	scanf("%c",&desig);
	if(desig == 'm'){
		goto manager;
	}else if(desig == 'p'){
		goto peon;
	}else if(desig == 'c'){
		goto clerk;
	}else {
		printf("\n invalid designation");
		goto end;
	}
	manager:
		bonus=1200;
		sal=sal+bonus;
		goto end;
	peon:
		bonus=100;
		sal=sal+bonus;
		goto end;
	clerk:
		bonus=500;
		sal=sal+bonus;
		goto end;
		
	end:
		printf("\ total salary = %d",sal);
	
}
