package OOP.Subpackage.Task9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

//Create Interface IDriver with two public methods: clickOnButton and GetTextOfElement.
// Create an abstract class driver with implementing the interface.
// Add two other methods clickOnElement and findElement.
// One of them should be visible for child classes only and another one with frames of package. Involve them in public methods coming from interface.
// Create two child classes of Driver class. Override one of the public methods in one child class and overload another one in another one with involving сorresponding driver functions.
// In the main method, one should create an instance of a driver depending on the external argument.  For an abstract class set field which should become true when the method (clickOnButton) is performed at least once.
// Configure the capabilities and click on some link and get some Text with implemented functions.
// Almost all methods should be invovled  except one which you should point out.

public class ClickText {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");  //To disable yellow strip info bar which prompts info messages
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        WebDriver chromeDriver = (WebDriver) new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "https://www.w3schools.com/";

        chromeDriver.get(url);

        chromeDriver.findElement(By.linkText("Paid Courses")).click();

        System.out.println("Page is opened after click on Paid Courses " + chromeDriver.getTitle());
        driver.close();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



       // driver.get("https://www.tutorialspoint.com/about/about_careers.htm");  // identify element with link text then apply click()
       // WebElement p = driver.findElement(By.linkText("Privacy Policy"));
       // p.click();
        //System.out.println("Page title after link click : " + driver.getTitle());


    }
}

