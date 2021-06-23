package Basic;

// Task2 - use conditions "if" and  "case"Create 4 boolean variables(true,true,false,false) and compare them between themselves - result print in console.
// Create 4 different numeric variables and compare them with the usage of <,<=,!=,==,===,>=,> . Explain result ·
// Create 2 different strings. Compare them with usage if trinar operator and print "Not equal", "Equal" and explain ·
// Explain difference betweeb &,|,&&,|| and provide example. ·
// Create 2 string variables with same value but initialize one with literal and another with constructor.(String a ="lalala";
// String b = new String("lalala");) Compare this values with usage of == and equal. Explain result

public class Task2 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        if (a == b) ;
        System.out.println("boolean a  is equal b, result is: " + b);
        if (a != c) ;
        System.out.println("boolean a is not equal c, result is: " + c);
        if (a == d) ;
        System.out.println("boolean a is equal to d, result is: " + a);
        if (a != d) ;
        System.out.println("boolean a is not equal to d, result is: " + d);

        // Compare booleans variables using 'if" loop and print in console

        int s = 4;
        switch (s) {
            case 1:
                System.out.println("true");
                break;
            case 2:
                System.out.println("on");
                break;
            case 3:
                System.out.println("off");
                break;
            case 4:
                System.out.println("no");
                break;
            case 5:
                System.out.println("false");
                break;

        }

//  Use  switch statement to select one of many code blocks to be executed.


        int x = 2;
        int y = 5;
        int z = 15;
        int w = 22;


        String result = (x < 10) ? "true" : "false";
        System.out.println(result);

        //  Use less than: "<" condition and use ternary operator to replace multiple lines of simple if...else statement

        if (y <= 5) {
            System.out.println(true);
        }

        // Use less than or equal to: "<=" condition with if statement to compare value


        if (z != 12) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
        // Use Not Equal to: "!=" condition with if...else statement to compare value

        if (w == 22) {
            System.out.println("equal");
        }
        // Use Equal to: "==" condition with if statement to compare value

        if (y >= x) {
            System.out.println("Greater than or equal to");
        }
        // Use "Greater than or equal to: ">=" condition with if statement to compare value

        if (w > z) {
            System.out.println("grater than z ");
        }

        // Use "Greater than: ">" condition with if statement to compare value

        String language = "english";
        String accent = "british";

        String r = (language == accent) ? "Equal" : "Not equal";
        System.out.println(r);

        //Outputs "Not equal".Use Ternary Operator to replace simple if else statements

        String n = (language != accent) ? "Equal" : "Not equal";
        System.out.println(n);

        //Outputs "Equal". Use Ternary Operator to replace simple if else statements

        int m = 3;
        int k = 8;
        int l = 9;
        System.out.println(m & k); // Bitwise AND Operator copies a bit to the result if it exists in both operands.
        System.out.println(m < 10 && m < 20); // true & true = true. Use "Logical and", returns true if both statements are true
        System.out.println(m | l);//Bitwise OR Operator copies a bit if it exists in either operand.
        System.out.println(l > 10 || l < 19); // Returns true if one of the statements is true. Use "Logical or"

        //TASK:
        // Create 2 string variables with same value but initialize one with literal and another with constructor.(String a ="lalala";
        //String b = new String("lalala");) Compare this values with usage of == and equal. Explain result

        String s1 = "lalala";
        String s2 = new String("lalala");

        System.out.println(s1 == s2); // Returns false, because operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
        System.out.println(s1.equals(s2)); // Using equals, the result is true because its only comparing the values given in s1 and s2.
    }

}
















