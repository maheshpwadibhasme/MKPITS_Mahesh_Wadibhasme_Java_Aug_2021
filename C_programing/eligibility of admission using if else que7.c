//Que7-Write a C program to find the eligibility of admission for a professional course based on the following criteria: Go to the editor
//Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 or Total in Maths and Physics >=140 ------------------------------------- 

#include<stdio.h>
int main(){
	int math,phy,chem,total;
	printf("enter a mark of math:-");
	scanf("%d",&math);
	
	printf("enter a marks of phy:-");
	scanf("%d",&phy);
	
	printf("enter a marks of chem:-");
	scanf("%d",&chem);
	
	if(math>=65 && phy>=55 && chem>=50){
		printf("the candidate is eligible");
	}else if(math+phy+chem>=170){
		printf("the candidate is eligible");
	}else if(math+phy>=120){
		printf("the candidate is eligible");
	}else{
		printf("the candidate not eligible");
	}
}