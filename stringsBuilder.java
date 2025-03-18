public class stringsBuilder {

    public static void main(String[] args) {
        /*
         * StringBuilder sb = new StringBuilder("Mukesh");
         * System.out.println(sb);
         * 
         * // chart at index 0
         * System.out.println(sb.charAt(0));
         * 
         * // set char at index
         * /*
         * sb.setCharAt(0, 'N');
         * System.out.println(sb);
         */

        // insert index..
        /*
         * sb.insert(3, 'e');
         * System.out.println(sb);
         * 
         * //detlete the extera 'e'
         * 
         * sb.delete(3, 4);
         * System.out.println(sb);
         */

        // append..(last me word jurta chale jayega..)

        /*
         * StringBuilder sb = new StringBuilder("H");
         * sb.append("e");
         * sb.append("l");
         * sb.append("l");
         * sb.append("o");
         * sb.append("w");
         * System.out.println(sb);
         * System.out.println(sb.length());
         */

         //revarse builder../

         StringBuilder sb = new StringBuilder("hello");
         for(int i=0; i<sb.length()/2; i++){
            int fornt = i;
            int back = sb.length() - 1 - i;   // 6-1-0=>5
            
            char frontChar = sb.charAt(fornt);
            char backchar = sb.charAt(back);
            
            sb.setCharAt(fornt, backchar);
            sb.setCharAt(back, frontChar);
         }
         System.out.println(sb);

    }
}
