package basics.array;

public class basicArray {

    static int n = 5;

    public static void main(String[] args) {
        //declaration
        int[] anArray;
        //initialization
        anArray = new int[n];
        anArray[0] = 15;
        System.out.println(anArray[0]);

        int size = anArray.length;
        System.out.println("Length = " + size);
    }
}
