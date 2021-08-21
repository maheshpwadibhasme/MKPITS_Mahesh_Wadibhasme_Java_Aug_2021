//wap to accept age of 5 students using for loop and then display the average age.

#include<stdio.h>
int main(){
	int age,total,i;
	float average;
	for(i=1;i<=5;i++){
		printf("enter 5 student age=");
	    scanf("%d",&age);
	    total=total+age;
	}
		average=(float)total/5.0f;
		printf("\n average age of student=%0.f",average);
}