#include <stdio.h>
void r(int);

int  main(){
    r(4);
    return 0;
}

// 再帰処理
void r(int n) {
    if (n > 0) {
        r(n - 2);
        printf("%3d", n);
        r(n - 1);
    }
}