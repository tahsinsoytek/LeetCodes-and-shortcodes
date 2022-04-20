#include <stdio.h>
#include <stdlib.h>
#define MAXLENGHT 50
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char dizgi[MAXLENGHT];
	int eb,sayac;
	int x,i,j,kelime_sayisi,harf_sayisi;
	printf("Cumle:");
	gets(dizgi);
    x=strlen(dizgi);
    kelime_sayisi=1;
	for(i=0;i<x;i++)
	{
		if(dizgi[i]==' ')
		{
			kelime_sayisi=kelime_sayisi+1;
		}
		
	}
	int dizi[kelime_sayisi];
	printf("Cumleniz %d kelimeden olusmakta\n",kelime_sayisi);
	harf_sayisi=0;
	j=0;
	for(i=0;i<x;i++)
	{
		
		if(dizgi[i]==('.')||dizgi[i]==(' '))
		{ 
	      printf("Sayac =%d\n",harf_sayisi);
		  dizi[j]=harf_sayisi;
		  j=j+1;
		  harf_sayisi=0;
		}
		else
		{
		  harf_sayisi=harf_sayisi+1;
		}
		
	}
	//Dizideki en büyük sayýyý bul
	eb=0;
	sayac=1;
	for(i=0;i<kelime_sayisi;i++)
	{
	    if(dizi[i]>eb)
		{
			eb=dizi[i];
			sayac=i+1;
		}	
	}
    printf("Dizgideki en uzun kelimenin harf sayisi:%d\n",eb);
	printf("%d. kelime",sayac);
	return 0;
}
