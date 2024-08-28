/* Create a package com.shape containing the following classes and interfaces.
An interface Polygon containing the members as given below:
void calcArea( );   Method to calculate area 
void calcPeri( );   Method to calculate perimeter 
Create a class Square that implements Polygon and has the following member:
        side    float
Create another class Rectangle that implements Polygon and has the following member:
        length      float
        breadth     float
In another package com.test, create a class that imports the above package and instantiates an object of the Square class and an object 
of the Rectangle class. 
Call the methods on each of the classes to calculate the area and perimeter given the side and the length/breadth of the Square class and 
the Rectangle class respectively.
 */

package com.tvsmotor.day7.test;
import com.tvsmotor.day7.shape.*;

public class TestShape 
{
	public static void main(String[] args)
	{
        Square s = new Square(5);
        s.calcArea();
        s.calcPeri();
        Rectangle r = new Rectangle(5, 10);
        r.calcArea();
        r.calcPeri();
        
        Polygon p = new Square(10);
        p.calcArea();
        p.calcPeri();
    }
}
