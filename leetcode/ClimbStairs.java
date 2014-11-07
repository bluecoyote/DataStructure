/**
 * Climbing Stairs, each step one or two. 
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        if(n <= 0) return 1;
        if(n == 1) return 1;
        for(int i = 1; i < n; i++){
            int temp = b;
            b = a + b;
            a= temp;
        }
        return b;
    }
}