package OOP.Subpackage.Polymorfism;

import org.jetbrains.annotations.NotNull;

//Task - Polymorphism. Demonstrate its applying (at least 3 classes are needed)
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(@NotNull Animal animal) {
        animal.eat();
    }
}



