class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
    
    // Method overloading
    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Some generic sound
        animal.eat(); // Output: Animal is eating
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof woof
        dog.eat(); // Output: Animal is eating
        dog.eat("bones"); // Output: Dog is eating bones
    }
}