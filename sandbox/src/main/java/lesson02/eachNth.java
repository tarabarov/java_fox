package lesson02;

public class eachNth {

    public static void main(String[] args) {

        everyNth("Julia", 2);
 //     everyNth("mouse", 2);
  //    everyNth("Achilles", 2);
  //    everyNth("Boris", 1);
        everyNth("belohorodka", 2);
    }

    public static void everyNth(String text, int n) {

        int len = text.length();

        while ( n <= len)

        {
            System.out.println( text.substring(n-1, n) );
            n = n + n;
        }



    }

}