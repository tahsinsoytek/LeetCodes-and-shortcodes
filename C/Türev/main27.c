#include <stdio.h>
#include <stdlib.h>
#define F(x) (3*x*x) 


int main(int argc, char *argv[]) 
{
	float h,x,dilimsayisi,x1,toplam;
	dilimsayisi=1000;
	printf("Yukarida tanimlanmis olan diferansiyel denklemin hangi degerini istiyorsunuz?");
	scanf("%f",&x);
	h=x/dilimsayisi;
	x1=0;
	toplam=0;
	while(x1<x)
	{
		toplam=(F(x1)*h)+toplam;
		x1=x1+h;
	}
	
	printf("Denklemin degeri = %1.1f",toplam);
	
	
	
	return 0;
}
