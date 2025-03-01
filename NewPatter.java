import java.util.Scanner;

public class NewPatter {
    public static void main(String[] args) {
        /*
         * int n = 4;
         * int m = 5;
         * Question 1...
         * 
         * // outerlopp..
         * for (int i = 1; i <= n; i++) {
         * // innerloop..
         * for (int j = 1; j <= m; j++) {
         * System.out.print("*");
         * }
         * System.out.println("*");
         * }
         */

        // Question 2..
        /*
         * int n = 4;
         * int m = 5;
         * 
         * // Outer Lopp ..
         * for(int i = 1; i <= n; i++){
         * //inner loop...
         * for(int j = 1; j<= m; j++){
         * //cell ->(i,j)
         * if(i==1 || j==1 || i==n || j==m){
         * System.out.print("*");
         * }
         * else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */

        // Question 3...
        /*
         * int n = 4;
         * for(int i =1; i <= n; i++){
         * for(int j =1; j<=i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Questio 4..

        /*
         * int n = 5;
         * //Outer Loop..
         * for(int i = n; i>=1; i--){
         * //Inner Loop..
         * for(int j = 1; j<=i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Question 7
        /*
         * int n = 5;
         * 
         * for (int i = 1; i<= n; i++){
         * for(int j =1; j<=i; j++){
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */

        // Question 9..
        /*
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n - i + 1; j++) {
         * System.out.print(j);
         * 
         * }
         * System.out.println();
         * }
         */

        // Question10..

        int n = 14;
        int number  = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++; //number = number + 1;
            }
            System.out.println();
        }
    }
}
