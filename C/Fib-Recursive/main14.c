#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int fib(int);
int main(int argc, char *argv[]) 
{
    int n;
    printf("Fibonacci serisinden kacinci sayiyi gormek istersiniz?\n");
    scanf("%d",&n);
    printf("%d",fib(n));
	return 0;
}
int fib(int x)
{
    if(x==2)
	{
		return 1;
	}
	else if(x==1)
	{
		return 0;
	}
	else 
	{
		return fib(x-1)+fib(x-2);
		
	}
  
  
}

