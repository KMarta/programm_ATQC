package Basic;

public class Task6 {

    /* SUBTASK: 6.1 Use "tr- catch"  to process the exceptions.
     *Check Exception Hierarchy.  Create a numeric variable. Divide it by zero. Handle exception and print in console exception message; */

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3, 4, 5, 6};
            System.out.println(myNumbers[5] / 0);
        } catch (Exception e) {
            System.out.println("Something went wrong. check again");
        }
    }
}
