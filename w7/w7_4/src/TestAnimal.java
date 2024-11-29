
public class TestAnimal {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        myDog.makeSound(); // Wywoła "Rex barks."
        myDog.eat();       // Wywoła "Rex is eating."
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Metoda abstrakcyjna
    public abstract void makeSound();

    // Metoda nieabstrakcyjna
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Getter dla name
    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Wywołanie konstruktora klasy bazowej
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}
