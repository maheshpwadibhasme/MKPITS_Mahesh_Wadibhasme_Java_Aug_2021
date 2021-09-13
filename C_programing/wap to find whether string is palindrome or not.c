//wap to find whether string is palindrome or not 
//(palindrome after reversing the string should be same ie madam,nayan)
#include<string.h>
int main(){
	char name[30];
	char orgname[30];
	char revname[30];
	printf("enter name = ");
	gets(name);
	strcpy(orgname,name);
	printf("\n org name =%s",orgname);
	strrev(name);
	printf("\n rev name =%s",name);
	if(strcmp(orgname,name)==0){
		printf("\n a string is palindrome");
	}else{
		printf("\n a string is not palindrome");
	}
}
