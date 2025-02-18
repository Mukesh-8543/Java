import java.util.Scanner;

public class If_Else_Stament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if else Statment...

        // int age = sc.nextInt();
        /*
         * if(age > 18){
         * System.out.println("Adult");
         * }
         * else{
         * System.out.println("Not Adult");
         * }
         */

        // Even and odd Number...

        /*
         * int x = sc.nextInt();
         * if(x % 2==0){
         * System.out.println("Even Number");
         * }
         * else{
         * System.out.println("Odd Number");
         * }
         */

        // Multipal Statment.....
        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * 
         * if (a == b) {
         * System.out.println("Equal");
         * } else {
         * if (a > b) {
         * System.out.println("A is Grater");
         * } else {
         * System.out.println("A is lesser");
         * }
         * }
         */

        // Multipal Buttton.....

        /*
         * int button = sc.nextInt();
         * if(button == 1){
         * System.out.println("Hello");
         * }else if (button == 2){
         * System.out.println("Namaste");
         * 
         * }else if (button == 3){
         * System.out.println("Bonjore");
         * }else{
         * System.out.println("Invalid Buttun");
         * }
         */

        // Switch Statement...
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjor");
                break;

            default: System.out.println("Invalid button");
        }
    }

}
