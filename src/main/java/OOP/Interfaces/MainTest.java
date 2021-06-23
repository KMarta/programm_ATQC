package OOP.Interfaces;

import org.jetbrains.annotations.NotNull;

public class MainTest {
    public static void main(String[] args) {
        Pets pets = new Pets(1);
        Person person = new Person("Tom");
        outputInfo(pets);
        outputInfo(person);
    }

    public static void outputInfo(@NotNull Info info) {
        info.showInfo();
    }
}
