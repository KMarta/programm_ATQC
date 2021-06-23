package OOP.Subpackage.Task9;



public abstract class  Driver implements IDriver {
    protected void clickOnElement() {
        System.out.println("User click on element");
    }

    public void getTextOfElement() {
        System.out.println("User is get text of element");
    }


    public static void main(String[] args) {
        int clickOnButton = 0;
        if (!(clickOnButton > 1)) {
            System.out.println("User click On Button at least once");
        } else {
            System.out.println("User click On Button more than once");
        }
    }
}








