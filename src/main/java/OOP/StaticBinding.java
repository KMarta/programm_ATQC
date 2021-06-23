package OOP;


// Create  class with static attributes and dynamic ones
public class StaticBinding {
    public static class superclass {
        static void print() {
            System.out.println("print static blinding in superclass");
        }
    }

    public static class subclass extends superclass {
        static void print() {
            System.out.println("print static blinding in subclass");
        }
    }

    public static void main(String[] args) {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();

    }

}
