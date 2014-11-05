// 二分搜索
#include <stdio.h>
int BinarySearch(const int A[], int x, int N);
int main(int argc, char *argv[])
{
    int a[] = {2,3,4,5,6,7,8,9,10,123,234,567,2345,3456};
    int location = BinarySearch(a, 567,14);
    printf("567 is in the %d location\n", location);
    int a1[] = {2,3,4,5,6,7,8,9,10,123,234,567,2345,3456};
    int location1 = BinarySearch(a1, 56,14);
    printf("567 is in the %d location\n", location1);
    
    return 0;
}
int BinarySearch(const int A[], int x, int N)
{
    if (N <= 0) {
       return -1; 
    }
    int low, mid, high;
    low = 0;
    high = N -1;
    while(low <= high) {
       mid = (low + high) / 2;
       if(A[mid] < x)
           low = mid +1;
       else if (A[mid] > x) 
           high = mid - 1;
       else
           return mid;
    }
    return -1;
}
