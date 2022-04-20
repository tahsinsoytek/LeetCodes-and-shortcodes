#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//Öklid algoritmasý der ki iki tane sayýnýn ebobu
//Büyük sayýnýn küçük sayýya bölümünden böleni ve kalaný alýrsýn
//sonra böleni kalana böldürürsün ve bu iþlem kalan 0 olana kadar devam eder
//Kalan 0 olduðunda bir önceki kalan iki sayýnýn ebobudur
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
