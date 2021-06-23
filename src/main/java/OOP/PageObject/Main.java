package OOP.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String SITE_URL = "https://www.w3schools.com";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);

    }

    public void chooseTask(String taskNumber) {
        click(By.xpath("//a[@title='Tutorials']"));

        driver.quit();
    }
}

