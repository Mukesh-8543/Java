import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednasday");
                break;

            default:
                System.out.println("Invalid Week Number");
                break;
        }
    }

}