//wap to print table of a number 

#include<stdio.h>
int main(){
	int num,result,i=1;
	char ans;
	do{
		printf("\n enter number:-");
		scanf("%d",&num);
		i=1;
	 while(i<=10){
		result=num*i;
		i++;
		printf("\n %d*%d=%d",num,i,result);
	    }
	    
	    printf("\n do you want to continue if yes press y otherwise n");
	    fflush(stdin);
	    scanf("%s",&ans);
		}while(ans=='y');
		printf("\n bye");
	
}