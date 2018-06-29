#include <stdio.h>

int a;
int b;
int c;

void main()
{
	a = -3;
	b = 21;
	printf("\n\n\n\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	c = 3*a + b/a + b;	// Answer suppose to be 5
	printf("c = 3*a + b/a + b\n");
	printf("c = %d\n\n\n\n", c);
}
