package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*TASK 7: Create FIle. Set text into file with digits and letters, where digits are in separate line.
* Read digits from the file and make some math operations with them */

public class Task7 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\File\\filename.txt");
            myWriter.write( String.format("%s%n%s", "1, 2, 3, 4, 5, 6, 7, 8, 9", "a, b, c, d, e, f, g, h, i"));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
    class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\File\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                System.out.println("File size:" + myObj.length());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
   class MathOperation {

    public static void main(String[] args) {

        // Create scanner class object
        Scanner in= new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :" + 5);
        int num1 = in.nextInt();
        System.out.println("Enter second number :" + 6);
        int num2 = in.nextInt();


        // Perform arithmetic operations.
        int sum 		= num1 + num2;
        int difference 	= num1 - num2;
        int product 	= num1 * num2;
        int quotient	= num1 / num2;
        int modulo	    = num1 % num2;


        // Print result to console.
        System.out.println("Sum : "         + sum);
        System.out.println("Difference : "  + difference);
        System.out.println("Product : "     + product);
        System.out.println("Quotient : "    + quotient);
        System.out.println("Modulo : "      + modulo);
    }
}



