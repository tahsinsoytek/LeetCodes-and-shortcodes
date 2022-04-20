#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int kare_sayisi(int);
int main(int argc, char *argv[]) {
	int x,y;
	printf("Kaca kaclik bir kareniz var?\n");
	scanf("%d",&x);
	printf("Toplam kare sayisi=%d",kare_sayisi(x));
	return 0;
}
int kare_sayisi(int x)
{
	if(x==1)
	{
		return 1;
	}
	else
	{
		return kare_sayisi(x-1)*4+1;
	}
	
	
}
