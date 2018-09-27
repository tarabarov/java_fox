package ru.stqa.fox.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("Julia");

    hello("Boris");

    hello("Achilles");

    int a = 5;

    multiply(5, 3);

    

    volume(2, 3, 4);

    text("privet", 2, 4 );

      System.out.println(2+ "+" +3+ "/" +4);
    test(2,3,4);



  }

    public static void hello(String name ) {

        System.out.println("Hello," + name + "!");
    }

    public static void multiply(int a, int b ) {

        System.out.println(a+ "*" +b + "=" +a*b);
    }

    public static void volume(int a, int b, int c) {
      int v;
      v = a*b*c;
        System.out.println(a+ "*" +b+ "*" +c+ "=" +v);

    }

    public static void text(String something, double a, double c) {
        System.out.println(something+ " " +a/c);
    }

    public static double test(int a, int b, int c) {
        return a+b/c;
    }



/*
  public static void hello() l{
      System.out.println("Hello, world");
  }

    public static void bye() {
        System.out.println("Bye, world");
    }

    public static void enot() {
        System.out.println("1 + 1");
    }
*/
}