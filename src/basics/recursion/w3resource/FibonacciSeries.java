package basics.recursion.w3resource;

public class FibonacciSeries {

    public static void fibonacci(int a, int b, int n) {
        //base case
        if(n == 0) {
            return;
        }

        //recursive part
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        int n = 30;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        fibonacci(a, b, n-2);
    }
}
