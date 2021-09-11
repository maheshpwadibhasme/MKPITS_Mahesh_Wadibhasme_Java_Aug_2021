//3- accepting string from the user without & operator and count vowel in the string.
#include<stdio.h>
int main(){
	char ch[20];
	int i=0;
	int count=0;
	printf("Enter name=");
	scanf("%s",ch);
	while(i<20){
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
			count=count+1;
		}
		i++;
	}
	printf("\n no. of vowel in the string=%d",count);
}