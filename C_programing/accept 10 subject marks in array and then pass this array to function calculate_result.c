//3- create a program to accept 10 subject marks in array and then pass this 
//array to function calculate_result  to calculate total,percentage and grade.
#include<stdio.h>
int main(){
	int marks[10],i;
	for(i=0;i<10;i++){
		printf("Enter 10 subjects marks=");
		scanf("%d",&marks[i]);
	}
	calculate_result(marks);
}
void calculate_result(int marks[]){
	int total=0,i;
	float per;
	for(i=0;i<10;i++){
		total=total+marks[i];
	}
	printf("total marks=%d \n",total);
	per=(float)(total/1000.2f)*100.2f;
	printf("percentage=%.2f%%",per);
	
	if(per>=75){
		printf("\n Grade=A");
	}else if(per>60 && per<75){
		printf("\n Grade=B");
	}
	else{
		printf("\n fail");
	}
}

