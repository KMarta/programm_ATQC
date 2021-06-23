package Basic;

public class Task1 {
    public static void main(String[] args) {


        // Create 5 variables and assign different values.

        int a = 10;
        long b = 10;
        float c = 12.3f;
        double d = 15.6;
        String s1 = "basic";
        String s2 = "secondString";

        // Compare variables

        a = 10;
        b = 10;

        System.out.println(a == b); // print true;


        c = 12.3f;
        a = 10;

        System.out.println(c < a); //print false

        d = 15.6;
        a = 10;

        System.out.println(d != a); // print true

        s1 = "basic";
        s2 = "secondString";


        System.out.println(s1.equals(s2)); // print false

        // Don`t assign any values and compare variables

        int i;
        long l1;
        float f1;
        double d1;
        String n1;
        String n2;


        /* i == l1;  variables cant be compared if not initialize;
         *   l1 == f1;
         *  f1 == d1;
         *  System.out.println(n1.equals(n2)); */

        // Assign the same value and compare them

        int i1 = 10;
        int i2 = 10;
        float f2 = 15.6f;
        float f3 = 15.6f;
        double d2 = 13.3;
        double d3 = 13.3;
        String s11 = "message1";
        String s12 = "message1";

        System.out.println(i1 >= 12); //print false;
        System.out.println(f2 <= f3); // print true;
        System.out.println(d2 != d3); // print false;
        System.out.println(s11.equals(s12)); //print true;

        // Assign in same order [0.5,0.7,1.0,0.1] values to float and double variables and compare them.
        float f11 = 0.5f;
        float f12 = 0.7f;
        float f13 = 1.0f;
        float f14 = 0.1f;

        System.out.println(f11 >= f12); //print false
        System.out.println(f13 < f14);  // print false
        System.out.println(f11 != f14); // print true
        System.out.println(f12 == f13); // print false

        double d11 = 0.5;
        double d12 = 0.7;
        double d13 = 1.0;
        double d14 = 0.1;

        System.out.println(d11 < d12); //print true
        System.out.println(d13 >= d14);  // print true
        System.out.println(d11 != d14); // print true
        System.out.println(d12 == d13); // print false

        /* Divide numeric values by zero

        int x = 12;
        int y = 0;

        System.out.println(x/y); // Dividing an integer by zero will result in an exception.

         */

        float f21 = -1.2f;
        System.out.println(f21 / 0); // The result is INFINITY, with the sign depending on the sign of the operands.


        //Divide values by 3 and assign result to variable.

        int x = 12;
        System.out.println(x = x / 3);
        System.out.println("New assign value of variables x is: " + x);

        // Divide values by 3.0 and assign result and make round operation.

        double d21 = 77.45;
        System.out.println(d21 = 77.45 / 3); // Assign result
        System.out.println(Math.round(d21)); // Math round () - round operation


    }


}
