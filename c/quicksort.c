#include <stdio.h>
void quicksort(int A[], int low, int high);
int partition(int A[], int low, int high);//定位选出数据的位置，此位置左侧都比右侧小（大）
void quicksort2(int A[], int low, int high);
int main(int argc, char *argv[])
{
    int a[] = {3,5,2,4,7,6};
    quicksort(a,0,5);
    for (int i = 0; i < 6; ++i)
    {
       printf("%d ", a[i]); 
    }
    printf("\n");
    int b[] = {3,2,4,1,5,6,0};
    quicksort2(b,0,6);
    for (int i = 0; i < 7; ++i)
    {
       printf("%d ", b[i]); 
    }
    return 0;
}
void quicksort(int A[], int low, int high){
    if(low < high){
        int i = low;
        int j = high;
        int x = A[low];
        
        while(i < j){
            while(i < j && A[j] >= x)
                j--;
            if (i < j){
               A[i++] = A[j]; 
            }
            while(i < j && A[i] <= x)
                i++;
            if(i < j){
                A[j--] = A[i];
            }
        }
        A[i] = x;
        quicksort(A,low, i - 1);
        quicksort(A, i + 1, high);
    } 
}
int partition(int A[], int low, int high){
    int x = A[low];
    while(low < high){
        while(low < high && A[high] >= x) high--;
        if(low < high){
            A[low] = A[high];
            low++;
        }
        while(low < high && A[low] <= x) low++;
        if(low < high){
            A[high] = A[low];
            high--;
        }
    }
    A[low] = x;
    return low;
}

void quicksort2(int A[], int low, int high){
    if(low < high){
        int location = partition(A, low, high);
        quicksort2(A, low, location - 1);
        quicksort2(A, location + 1, high);
    }
}
