package basics.recursion.apnacollege;

public class XExponentialLogN {

    public static int exponential(int x, int n){
        //base case
        if(n==0) {
            return 1;
        }

        //recursive way
        int half = exponential( x, n/2);
        if(n%2 == 0) {
            return half*half;
        } else {
            return half*half*x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int p = exponential(x, n);
        System.out.println(p);
    }
}
