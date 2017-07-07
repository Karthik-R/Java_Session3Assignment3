package javaSession3Assignment3;

/*
 * This program will demonstrate Constructor Chaining 
 */
class Animal {

	Animal() { // Default Constructor defined for class
		System.out.println("Animal constructor is called");
	}

}

class Dog extends Animal { // subclass extends superclass

	Dog() { // Default Constructor defined for class
		System.out.println("Dog constructor is called");
	}
}

public class ConstructorChainingDemo { // main class

	public static void main(String[] args) {
		System.out.println("Demonstration of Construction chaining");
		Dog dObj = new Dog(); // Initializing Dog class object
		dObj.toString();
		System.out.println("Dog object initialized within main Class");
	}

}
