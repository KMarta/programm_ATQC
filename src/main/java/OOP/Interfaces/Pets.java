package OOP.Interfaces;

public class Pets implements Info {
    public int id;

    public Pets(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Pet is sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is -  " + this.id);
    }
}
