package OOP;

/* Task 3: Create class with 5 variables of different types.
   Create or override method toString() that will print return text representation of instance.
   Create instance and print it in console.
 */

public class Vehicle {


    // Create class with 5 variables of different types.
    int myInt;
    double myDouble;
    float myFloat;
    boolean myBoolean;
    char myLetter;

    Vehicle(int myInt, double myDouble, float myFloat, boolean myBoolean, char myLetter) {
        this.myInt = myInt;
        this.myDouble = myDouble;
        this.myFloat = myFloat;
        this.myBoolean = myBoolean;
        this.myLetter = myLetter;

    }

    public String toString() {
        return myInt + " " + myDouble + " " + myFloat + " " + myBoolean + " " + myLetter;

    }

    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle(1, 4.5, 6.76f, true, 'D');
        System.out.println(obj1);
        System.out.println(obj1.toString());

    }
}






