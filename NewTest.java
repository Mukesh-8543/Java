import java.util.Scanner;

public class NewTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i =1; i <= 10; i++){
            System.out.print(name + " ");
        }
    }

}