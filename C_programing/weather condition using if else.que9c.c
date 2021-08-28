//Write a C program to read temperature in centigrade and display a suitable message according to temperature state below 
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 11-20 then Cold weather
//Temp 21-30 then Normal in Temp
//Temp 31-40 then Its Hot
//Temp >=40 then Its Very Hot
#include<stdio.h>
int main(){
	int temp;
	printf("enter a temperature");
	scanf("%d",&temp);
	if(temp<0){
		printf("freezing weather");
	}else if(temp>=0 && temp<=10){
		printf("very cold weather");
	}else if(temp>=11&&temp<=20){
		printf("cold weather");
	}else if(temp>=21&&temp<=30){
		printf("normal temp");
	}else if(temp>=31&&temp<=40){
		printf("its hot");
	}else{
		printf("its very hot");
	}
}