// //wap to create an intiger array of 3 element to store 3 no.
// accept 3 no. from the user and store it in an array
//then display the value stored in an array

int main(){
	int i;
	int num[5];
	for(i=0;i<5;i++){
		printf("enter no");
		scanf("%d",&num[i]);
	} 
	for(i=0;i<5;i++){
		printf("num[%d]=%d",i,num[i]);
	}
}
