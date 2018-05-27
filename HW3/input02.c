#include <stdio.h>

int rev(int num){
    int reverse=0;
    while(num){
        reverse *= 10;
        reverse += num%10;
        num /= 10;
    }
    return reverse;
}

int main(){
    //freopen("","r",stdin);
    int n=10053;
    if(n>0){
		n = rev(n);
	}
    return 0;
}


