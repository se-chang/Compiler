#include <stdio.h>

int a;
int b;
//int c;

void main()
{
	int c;
	a = 30;
	b = 8;
	c = a/b + 15;
	printf("\n\n\n\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("c = a/b+15\n");

	if(c-15){
		printf("c is not equal to 15.\n");
	}

	if(c-18){
		printf("c is not equal to 18.\n");
	}
	printf("c = %d\n\n\n\n",c);
		
}
