package OOP;

// Task 2 Constructor method. Constructor arguments

public class Constructor {

    Constructor() {
        System.out.println("Default Constructor");
    }
    /*  Parameterized constructor with
     * two integer arguments
     */

    Constructor(int i, int y) {
        System.out.println(("constructor with Two parameters"));
    }

    /* Parameterized constructor with
     * three integer arguments
     */
    Constructor(int i, int y, int j) {
        System.out.println(("constructor with Three parameters"));
    }
    /* Parameterized constructor with
     * two arguments, int and String
     */

    Constructor(int i, String name) {
        System.out.println("constructor with int and String param");

    }

    public static void main(String[] args) {


        //This will invoke default constructor
        Constructor obj = new Constructor();

        /* This will invoke the constructor
         * with two int parameters
         */
        Constructor obj2 = new Constructor(8, 18);


        /* This will invoke the constructor
         * with three int parameters
         */

        Constructor obj3 = new Constructor(1, 3, 5);

        /* This will invoke the constructor
         * with int and String parameters
         */

        Constructor obj4 = new Constructor(7, "Marta");

    }

}

