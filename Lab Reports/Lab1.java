class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.sound();
        animal.eat();
        animal.eat("grass");

        Dog dog = new Dog("Buddy");
        dog.sound();     
        dog.eat();      
        dog.eat("meat"); 
    }
}
