public class MaxSubArray {
    public int maxSubArray(int[] A) {
        int Max = A[0];
        int curSum = A[0];
        for(int i = 1; i < A.length; i++){
            if(curSum < 0 && curSum < A[i] ){
                curSum = A[i];
            }else{
                curSum += A[i];
            }
            if(curSum > Max){
                Max = curSum;
            }
        }
        return Max;
    }
}