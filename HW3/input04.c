#include <stdio.h>
int main() {
    int score = 0;
    int level = 0;
    printf("輸入分數：");
    scanf("%d", &score);
    level = score / 10;
    switch(level) {
        case 10:
        case 9:
            puts("得A");
            break;
        case 8:
            puts("得B");
            break;
        case 7:
            puts("得C");
            break;
        case 6:
            puts("得D");
            break;
        default:
            puts("得E（不及格）");
    }
    return 0;
}
