#include <stdio.h>
#include <stdlib.h>
#define F(x) (x*x)

int main(int argc, char *argv[]) 
{
	float toplam=0.0;
	float x;
	float dilimsayisi=1000;
	float h;
    float x_alt,x_ust;
	printf("Bu fonksiyonda hangi degerler arasi integral almak istersiniz?");
	scanf("%f%f",&x_alt,&x_ust);
    h=(x_ust-x_alt)/dilimsayisi;
    x=x_alt;
	while(x<x_ust)
	{
		toplam=toplam+(F(x)*h);
		x=x+h;
	}
	printf("Toplam=%1.2f",toplam);
	return 0;
}
