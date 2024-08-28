package com.tvsmotor.day7.shape;

public class Rectangle implements Polygon
{
    float length, breadth;
    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void calcArea()
    {
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
    public void calcPeri()
    {
        System.out.println("Perimeter of Rectangle: "+(2*(length + breadth)));
    }
}