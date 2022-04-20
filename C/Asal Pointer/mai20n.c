#include <stdio.h>
#include <stdlib.h>
//Parametre olarak bir asal sayý alan ve bu asal sayýdan küçük en büyük asal sayýyý döndüren program
int asal_kontrol(int);
int asal_bul(int*);
int main(int argc, char *argv[]) 
{
	int x;
	int flag=1;
	printf("Asal bir sayi giriniz->");
	scanf("%d",&x);
	flag=asal_kontrol(x);
	if(flag==1)
	{
		printf("Girdiginiz asal sayidan onceki asal sayi=%d",asal_bul(&x));	
	}
	return 0;
}
int asal_kontrol(int x)
{
	int i;
	int flag=1;
	for(i=2;i<x;i++)
	{
	   if(x%i==0)
	   {
	     printf("Sayiniz asal degil\n");
	     flag=0;
	     break;
	   }
	
	}
	return flag;
	
}
int asal_bul(int *x)
{
	
	int flag=1;
	int *p;
	int i,sayac,j;
	sayac=0;
	 p=(int*)malloc(sizeof(int)*15);
	for(i=2;i<=*x;i++)
	{
		flag=1;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			sayac=sayac+1;
		    p[sayac-1]=i;
		}
		
		 	
	}
	return p[sayac-2];
	
	

	
}
