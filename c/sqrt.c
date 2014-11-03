/*
 * 牛顿法求平方根 X[n+1] = ( X[n] + N / X[n] ) / 2;
 * 迭代和递归
 * 递归的话构造出递归函数(参数)
 *
 */
#include <stdio.h>
#include <math.h>
float func(int n){
    float x1 = 1.0;
    float y1;
    y1 = ( x1 + n / x1 ) / 2;
    do {
        x1 = y1;
        y1 = ( x1 + n / x1 ) / 2;
    } while(fabsf(y1 - x1) >= 1e-5);
    return y1;
}
float func_digui(float x1, int n){
    float y1 = (x1 + n / x1) / 2;
    if(fabsf(y1 - x1) < 1e-5){
        return y1;
    }else{
        return func_digui(y1, n);
    }
}
int main(int argc, char *argv[])
{
    float tt = func(9);
    printf("func(9)= %f\n", tt);
    float dd = func_digui(1.0, 9);
    printf("func_digui(9)= %f\n", dd);
    return 0;
}
