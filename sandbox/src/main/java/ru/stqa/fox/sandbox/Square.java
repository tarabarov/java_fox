package ru.stqa.fox.sandbox;

public class Square {

   public double storona_a;

   public Square(double len) {
       this.storona_a = len;
   }
    public double area() {
        return this.storona_a * this.storona_a;
    }
}



