public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        if(n == 0) return;
        if(m == 0){
            for(int i = 0; i < n; i++){
                A[i] = B[i];
            }
            return;
        }
        int k = m+n-1;
        
        while(m >=0 && n >=0){
            if(m ==0 && n == 0) break;
            while (n == 0 || A[m-1] > B[n-1]){
                A[k] = A[m-1];
                k--;
                m--;
                if(m <= 0){
                    break;
                }
            }
            while(m == 0 || A[m-1] <= B[n-1]){
                if(n <= 0){
                    break;
                }
                A[k] = B[n-1];
                k--;
                n--;
                if(n <= 0){
                    break;
                }
            }
        }
    }
}