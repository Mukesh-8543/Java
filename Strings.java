import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String Declaration
        /*
         * Scanner sc = new Scanner(System.in);
         * String name = sc.nextLine();
         * System.out.println(" Your name is : " + name );
         */

        // concatenation
        /*
         * String firstName = "Mukesh";
         * String lastName = "yadav";
         * String fullName = firstName + " " + lastName;
         * // System.out.println(fullName);
         * // // lenght count kaise kare...
         * System.out.println(fullName.length());
         * 
         * //charAt
         * 
         * for(int i=0; i<fullName.length(); i++){
         * System.out.println(fullName.charAt(i));
         * }
         */

         //compare to String
         String name1 ="Mukesh";
         String name2 = "Yadav";

         //1 s1>s2  : + ve values;
         //2 s1==s2 : 0 ;
         //3 s1<s2  : -ve values;
         if(name1.compareTo(name2)==0){
            System.out.println("String are equal. ");

         }else{
            System.out.println("String are not equal.");
         }
    }
}
