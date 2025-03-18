import java.util.Scanner;

public class NewTest {
    /**
     * @param args
     */
          public static void main(String[] args) {
               StringBuilder sb = new StringBuilder("MukeshKumar");
               System.out.println(sb);
               System.out.println(sb.length());
               System.out.println(sb.charAt(5));

               sb.insert(6, 'Y');
               System.out.println(sb);

               sb.delete(6, 7);
               System.out.println(sb);

               sb.setCharAt(6, 'y');
               System.out.println(sb);
          }    
     }

