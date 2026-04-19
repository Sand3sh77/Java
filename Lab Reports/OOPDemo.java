class Animal { void sound() {
System.out.println("Animal makes sound");
}
void eat() {
System.out.println("Animal eats food");
}
void eat(String food) { // Method Overloading System.out.println("Animal eats " + food);
}}

class Dog extends Animal { // Inheritance @Override
void sound() {	// Method Overriding System.out.println("Dog barks");
}}

public class OOPDemo {
public static void main(String[] args) { Animal a = new Animal(); a.sound();
a.eat("grass");

Dog d = new Dog(); d.sound();
}}
