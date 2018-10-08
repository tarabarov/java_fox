package ru.stqa.fox.sandbox;

public class Rectangle {

    public double storona_a;
    public double storona_b;

    public Rectangle(double storona_a, double storona_b) {
        this.storona_a = storona_a;
        this.storona_b = storona_b;
    }
    public double area() {
        return this.storona_a * this.storona_b;
    }
}
