package OOP.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage {
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//a[@title='Tutorials']"));
    }
}
