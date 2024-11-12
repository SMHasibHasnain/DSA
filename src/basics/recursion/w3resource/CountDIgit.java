package basics.recursion.w3resource;

public class CountDIgit {
    public static int howMuchDigit(int p) {
        //base case
        if(p==0) {
            return 0;
        }

        //recursive part
        return 1 + howMuchDigit(p/10);

    }
    public static void main(String[] args) {
        int p = 5453;
        int count = howMuchDigit(p);
        System.out.println(count);
    }
}
