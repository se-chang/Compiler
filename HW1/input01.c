#include <stdio.h>
#include "myfile.h"

int main(void){
	double sum = 0.404410053;
	int up_bound;
	while (sum < 87) {
		scanf("%d", &up_bound);
		for(int i=1; i<=up_bound; i++)
			sum += i;
		if(sum < 87)
			printf("Less than 87, Try again!\n");
		else
			printf("More than 87\n");
	}
	return 0;
}
