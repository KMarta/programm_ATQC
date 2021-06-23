package OOP;

// Create  class with static attributes and dynamic ones
public class DynamicBinding {
    public static class superclass {
        void print() {
            System.out.println("print dynamic binding in superclass ");

        }
    }

    public static class subclass extends superclass {
        @Override
        void print() {
            System.out.println("print dynamic binding in subclass");

        }
    }

    public static void main(String[] args) {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}
