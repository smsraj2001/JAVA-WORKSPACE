package com.tvsmotor.demo;

import java.util.ArrayList;

class Animal
{
    String color;

	public Animal(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    


}
class Dog extends Animal
{
    int legs;
	public Dog(String color, int legs) 
    {
        super(color);
        this.legs = legs;
    }
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", color=" + color + ", getLegs()=" + getLegs() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    

}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("black", 4));
        animals.add(new Dog("brown", 4));
        
        animals.forEach(System.out::println);
        System.out.println("-------------------------");
        
        for(Animal animal : animals)
        {
        	Dog dog = (Dog) animal;
        	System.out.println(animal);
        	System.out.println(dog.color + " " + dog.legs);
        }
        
        animals.stream().map(Dog.class :: cast).filter(a -> a.legs < 4).forEach(System.out::println);
	}
}

//Employee e = new Employee();
//Person p = new Employee(); // Upcasting
//
//Person p = new Person();
//Employee e = (Employee)p; // Downcasting
