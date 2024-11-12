package basics.recursion.level1;

public class xexponential {
    public static int exponential(int x, int n){
        if(n==0) {
            return 1;
        }
        int xpownm1 = exponential(x, n-1);
        int xpown = xpownm1 * x;
        return xpown;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = exponential(x, n);
        System.out.println(ans);
    }
}
