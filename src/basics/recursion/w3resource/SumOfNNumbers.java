package basics.recursion.w3resource;

public class SumOfNNumbers {

    public static int SumOfNum(int n) {
        //base case
        if(n==0) {
            return 0;
        }

        //recursive part
        int sum = n + SumOfNum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 50;
        int sum = SumOfNum(n);
        System.out.println(sum);
    }
}
