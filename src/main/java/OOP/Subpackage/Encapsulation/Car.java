package OOP.Subpackage.Encapsulation;

// Task 5. Encapsulation. Demonstrate with different class attributes: methods and fields. Access modifiers.
public class Car {
    private String model;
    private String color;
    private double fuelConsumption;
    private String numberLicence;
    private double fuelInTank;

    public Car() {
        fuelInTank = 0;
        numberLicence = "ВС7997AC";
    }

    public Car(String model, String color, String form, double engineV, double fuelConsumption, String numberLicence, double fuelInTank) {
        this.model = model;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.numberLicence = numberLicence;
        this.fuelInTank = fuelInTank;

    }

    public void fillTank(int fuelV) {
        fuelInTank = fuelInTank + fuelV;  //refuel the car

    }

    public void drive(double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;  // travel the distance
    }

    public String getModel() {
        return model;
    }


    public double getFuelInTank() {
        return fuelInTank;
    }

    public void setColor(String value) {
        if (value.compareTo("blue") != 0)
            color = value;
    }

    public String getColor() {
        return color;
    }

    public String getNumberLicence() {
        return numberLicence;
    }
}






