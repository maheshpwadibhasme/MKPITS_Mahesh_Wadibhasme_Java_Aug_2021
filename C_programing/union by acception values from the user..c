//6 -example of union by acception values from the user.
//displaying corrupted value of i and j
union data{
	int i;
	float j;
	char name[20];
}d1;
int main(){
	printf("\n Enter a value of i(int i)");
	scanf("%i",&d1.i);
	//printf("value of i =%i \n",d1.i);
	
	printf("\n Enter value of j (float value)");
	scanf("%f",&d1.j);
	//printf("value of j =%f \n",d1.j);
	
	printf("\n Enter name ");
	scanf("%s",&d1.name);
	printf("value of i =%i \n",d1.i);
	printf("value of j =%f \n",d1.j);
	printf("name = %s",d1.name);
}
