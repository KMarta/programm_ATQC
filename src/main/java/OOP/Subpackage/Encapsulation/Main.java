package OOP.Subpackage.Encapsulation;

// main class of encapsultion
public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car mySister = new Car("Audi", "red", "sedan", 1.8, 6, "BC1818TC", 10);

        myCar.fillTank(20);  //my sister drive 100
        myCar.setColor("pink");

        System.out.println("current fuel level= " + myCar.getFuelInTank() + ";  " + "color = " + myCar.getColor() + ";  " + "licenseNumber =  " + myCar.getNumberLicence());
        System.out.println("my sister`s car = " + mySister.getModel() + ";  " + "color = " + mySister.getColor());

    }
}
