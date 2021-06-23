package OOP.Interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void greеting() {
        System.out.println("Have a nice day");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is  - " + this.name);
    }
}
