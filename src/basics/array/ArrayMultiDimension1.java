package basics.array;

import java.util.Scanner;

public class ArrayMultiDimension1 {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row and col numbers: ");
        m = input.nextInt();
        n = input.nextInt();

        int[][] twoDArray = new int[m][n];

        System.out.println("Enter row and col members: ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                twoDArray[i][j] = input.nextInt();
            }
        }

        System.out.println("Inserted row and col members: ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
