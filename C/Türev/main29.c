#include <stdio.h>
#include <stdlib.h>
#define  F(x) (2*x*x*x)
int main(int argc, char *argv[]) 
{
	double x;
	double h=0.0000000001;
	double deger;
	double a;
	printf("Turevli fonksiyonun hangi degerini istiyorsunuz?");
	scanf("%lf",&x);
	a=x+h;
	deger=(F(a)-F(x))/h;
	printf("Deger=%1.1lf",deger);
	return 0;
}
