import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // method 1..
        /*
         * int marks[]= new int[4];
         * marks[0]= 85;
         * marks[1]=56;
         * marks[2]=87;
         * marks[3]=90;
         * for(int i=0; i<4; i++){
         * System.out.println(marks[i]);
         * }
         */
        // Method 2
        /*
         * int marks[] = {78,75,34,21};
         * for(int i=0; i<4; i++){
         * System.out.println(marks[i]);
         * }
         */

        // array ke input size ka pta kaise karte hai..

        /*
         * Scanner sc = new Scanner(System.in);
         * int size = sc.nextInt();
         * 
         * int number[] = new int[size];
         * 
         * for(int i=0; i<size; i++){
         * System.out.println(number[i]);
         * }
         */

        // array ke elements input kaise pta karte hai

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size]; // array
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }

}
