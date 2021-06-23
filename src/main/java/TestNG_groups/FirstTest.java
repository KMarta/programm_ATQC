package TestNG_groups;

import org.testng.annotations.Test;

public class FirstTest {

//Create a few test cases.
// Set two groups to different test cases and run with group parameter.
// Run test cases in parallel.
// Run the same test cases with different parameters

    @Test(groups = {"priority1"})
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(groups = {"priority1", "priority2"})
    public void login() {
        System.out.println("This is login test");
    }

    @Test(groups = {"priority3"})
    public void homePage() {
        System.out.println("This is Home page");
    }

    @Test(groups = {"priority3", "priority4"})
    public void mainPage() {
        System.out.println("This is Main page");
    }

    @Test(groups = {"priority5"})
    public void teardown() {
        System.out.println("closing browser");
    }
}


