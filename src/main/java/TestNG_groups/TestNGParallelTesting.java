package TestNG_groups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//  Run test cases in parallel. Run the same test cases with different parameters
public class TestNGParallelTesting {
    WebDriver driver = null;

    @Test(threadPoolSize = 3, invocationCount = 3, timeOut = 1000)
    public void test1() throws Exception {
        System.out.println("Run test 1 | " + Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.i.ua");
        driver.close();

    }

    @Test
    public void test2() throws Exception {
        System.out.println("Run test 2 | " + Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.close();


    }

}
