#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//�klid algoritmas� der ki iki tane say�n�n ebobu
//B�y�k say�n�n k���k say�ya b�l�m�nden b�leni ve kalan� al�rs�n
//sonra b�leni kalana b�ld�r�rs�n ve bu i�lem kalan 0 olana kadar devam eder
//Kalan 0 oldu�unda bir �nceki kalan iki say�n�n ebobudur
int main(int argc, char *argv[]) {
	int x,y,temp;
	printf("Ebobunu istediginiz iki sayi giriniz\n");
	scanf("%d%d",&x,&y);
    int kontrol=1;
	while(kontrol==1)
	{
		if(x>=y)
		{
			temp=x%y;
			if(temp==0)
			{
				printf("Ebob=%d\n",y);
				kontrol=0;
			}
			else
			{
				x=y;
				y=temp;
			}
			
		}
		else
		{
		temp=y%x;
		if(temp==0)
		{
			printf("Ebob=%d\n",x);
			kontrol=0;
		}
		else
		{
			y=x;
			x=temp;
		}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	return 0;
}
