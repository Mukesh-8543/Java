import java.util.Scanner;

public class NewTest {
    /**
     * @param args
     */
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int tables = sc.nextInt();
     for(int i =1; i<=10; i++){
          System.out.print(tables * i + " ");
     }
}
}