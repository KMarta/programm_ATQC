package OOP.Subpackage.Inheritance;

public class MainClass {

    //Encapsulation. Demonstrate with different class attributes: methods and fields. Access modifiers.

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Ivan", 28, 3000000, 1);
        Engineer e1 = new Engineer("Igor", 29, 9000000, "support");

        double totalSalary = d1.getSalaryUah() + e1.getSalaryUah();

        System.out.println("total salary = " + totalSalary);
    }
}
