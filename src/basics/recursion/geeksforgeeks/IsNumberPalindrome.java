//package basics.recursion.geeksforgeeks;
//
//public class IsNumberPalindrome {
//    public static int isNumberPalindrome(int num, int rev) {
//        if(num==0) {
//            return rev;
//        }
//        rev = isNumberPalindrome(num%10 + 10*num/10);
//    }
//
//    public static void main(String[] args) {
//        int num = 12321;
//        int rev = 0;
//        if(isNumberPalindrome(num, rev) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
//    }
//}
