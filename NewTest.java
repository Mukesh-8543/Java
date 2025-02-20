import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 0:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Number");
                break;
        }
    }

}