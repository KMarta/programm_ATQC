package Basic;

public class Task3 {

    public static void main(String[] args) {

        //SUBTASK1 : Create for, while, do while cycles that iterate 10 times and print iteration number to console.

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // use "for" loop and iterates 10 times and print iteration number to console
        }

        int i = 1;
        while (i < 10) {
            System.out.println(i);  //use "while" loop and iterates 10 times and print iteration number to console
            i++;
        }

        int n = 5;
        do {
            System.out.println(n); //use "do/while" loop and iterates 10 times and print iteration number to console
            n++;
        }
        while (n < 10);

    }

    // SUBTASK 2 : Create recursion with exit condition.


    public static class Recursion {
        public static void main(String[] args) {
            int i = sum(5, 10);
            System.out.println(i);
        }

        // Use recursion to add all of the numbers between 5 to 10.
        public static int sum(int start, int end) {
            if (end > start) {
                return end + sum(start, end - 1);
            } else {
                return end;
            }
        }

    }
}

            /* SUBTASK 3 : Create an infinite loop.
                *  for (int n = 1; n >= 1; n++) {  // This is an infinite loop as the condition would never return false.
                *  System.out.println("The value of i is: " + n);  */

































