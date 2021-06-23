package OOP.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryPatternTest {


    ChromeDriverManager driverManager;
    WebDriver driver;

    public static class NullPointerException extends RuntimeException {
        private static final long serialVersionUID = 5162710183389028792L;

        /**
         * Constructs a {@code NullPointerException} with no detail message.
         */
        public NullPointerException() {
            super();
        }

        /**
         * Constructs a {@code NullPointerException} with the specified
         * detail message.
         *
         * @param s the detail message.
         */
        public NullPointerException(String s) {
            super(s);
        }
    }


    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }


    @BeforeMethod
    public void beforeMethod() {
        driver = (WebDriver) driverManager.getDriver();
    }


    @Test
    public void launchStackoverflow() {
        driver.get("http://stackoverflow.com");
        Assert.assertEquals("StakeOverflow", driver.getTitle());
    }


    @Test
    public void launchW3schools() {
        driver.get("https://www.w3schools.com");
        Assert.assertEquals("w3schools", driver.getTitle());
    }


}


