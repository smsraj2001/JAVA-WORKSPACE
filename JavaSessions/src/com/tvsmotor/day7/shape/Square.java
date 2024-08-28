package com.tvsmotor.day7.shape;

public class Square implements Polygon
{
    float side;
    public Square(float side)
    {
        this.side = side;
    }
    public void calcArea()
    {
        System.out.println("Area of Square: " + (side * side));
    }
    public void calcPeri()
    {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}