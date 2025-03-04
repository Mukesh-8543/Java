import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Functions {
    // Question 1
    /* 
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    */

            //Question 2
        /* 
        public static int counculaterName(int a, int b){
            int sum = a + b;
            return sum;
        }
        */
    
        //Question 3
    
      /*  
       public static int multipal(int a, int b){
            return a*b;

        }
        */

            //Question 4 
        public static void printNameAge(String name , int age){
            System.out.println( " Name : "+name + " Age : " + age);
            return;

        }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age =sc.nextInt();
        
        //Question 3 ka function hai.. 
      /*   int sum  = multipal(a, b);
        System.out.println("prodect 2 number is : "+sum);*/
        
        printNameAge(name , age);
        
    }
}


