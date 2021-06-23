package Tutorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class SuperTest {
    WebDriver driver;
    String url = "https://www.i.ua";
public static final String LOGIN_FIELD = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input";

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setupTest() {
        driver = new ChromeDriver();
    driver.get("https://www.i.ua");


}
  @Test
    public void superTest(){
        // login to post
        driver.findElement(By.xpath(LOGIN_FIELD)).sendKeys("kmarta");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input")).sendKeys("Batram7997");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")).click();
        assertTrue(driver.getCurrentUrl().contains("https://mbox2.i.ua/"));

        //send letter
      driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[1]/p/a")).click();
      driver.findElement(By.xpath("//*[@id=\"to\"]")).sendKeys("kmarta7997@gmail.com");
      driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")).sendKeys("send by automation test");
      driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("Hello");
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/p[3]/input[1]")));



  }

  @AfterTest
    public  void afterTest(){
        driver.quit();


  }
}