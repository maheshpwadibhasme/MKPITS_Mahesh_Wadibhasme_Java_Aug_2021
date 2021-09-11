#include<stdio.h>
int main(){
	char ch[10];
	int count=0;
	int i=0;
	printf(" enter a string=");
	scanf("%s",&ch);
	while(i<10){
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
			count=count+1;
		}
		i++;
	}
	printf("\n no.of vowel in string=%d",count);
}
