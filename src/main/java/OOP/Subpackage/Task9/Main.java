package OOP.Subpackage.Task9;

public class Main implements IDriver {

    public static void main(String[] args) {
        Main mainTest = new Main();
        System.out.println(mainTest.clickOnButton(6));
        System.out.println(mainTest.clickOnButton(9));
        System.out.println(mainTest.getTextOfElement(5, 7));
        System.out.println(mainTest.getTextOfElement(5.6, 7.8));

    }

    public int clickOnButton(int a) {
        return a;
    }

    public double clickOnButton(double b) {
        return b;
    }

    public int getTextOfElement(int i, int x) {
        return i + x;
    }

    public double getTextOfElement(double y, double z) {
        return y + z;
    }

    @Override
    public void clickOnButton() {
    }

    @Override
    public void getTextOfElement() {
    }
}



