public class SearchInsert {
    public int searchInsert(int[] A, int target) {
        if(A[0] > target) return 0;
        if(A[A.length - 1] < target) return A.length;
        int low = 0;
        int high = A.length - 1;
        int mid = 0;
        while(low <= high){
            mid = (low + high) >> 1;//除以2的操作是右移一位，不是两位 >>1
            if(target > A[mid]){
                low = mid + 1;
            }else if(target < A[mid]){
                high = mid -1;
            }else{
                return mid;
            }
        }
        if(A[mid] < target) return mid + 1;
        return  mid;//边界条件，和low <= high中的等号直接相关
    }
}