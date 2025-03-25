import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // Get Bit Masking....

        /*
         * int n =5;//0101
         * int pos =1;
         * int bitMask = 1<<pos;
         * if((bitMask & n) == 0){
         * System.out.println("bit was zero");
         * }else{
         * System.out.println("bit was one");
         * }
         */
        // Set bit Masking
        /* 
          int n = 5;//0101
          int pos = 1;
          int bitMask = 1<<pos;
          
          if((bitMask | n)==0){
          System.out.println("bit was zero");
          }else{
          System.out.println("bit was one..");
          }
         */

        //Claer bit

      /*   int n = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        int newNumber = notbitmask & n;
        System.out.println(newNumber);
        */
        
        //Update Bit..
        Scanner sc =new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1; : set oper=0 : clear
        int n =5; //0101
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper ==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }//clear
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n ;
            System.out.println(newNumber);
        }
       

    }
}
