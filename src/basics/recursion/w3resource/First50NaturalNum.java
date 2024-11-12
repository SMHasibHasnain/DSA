package basics.recursion.w3resource;

public class First50NaturalNum {

    public static void naturalNum(int n) {
        //base case
        if(n==0) {
            System.out.print(n + " ");
            return;
        }

        //recursive part
        naturalNum(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.print("First " + n + " Natural Numbers: ");
        naturalNum(n);
    }
}
