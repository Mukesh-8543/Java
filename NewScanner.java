import java.util.Scanner;

public class NewScanner {
    public static void main(String[] args) {
        System.out.println("Taking input Form the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number 1");
      //  int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Eneter Number 2");
      //  int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of these number is");
        //System.out.println(sum);
        System.out.println(sum);

    }
}
