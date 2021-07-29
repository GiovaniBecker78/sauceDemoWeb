package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutCompletePage {
    private WebDriver driver;
    private Waits waits;

    public CheckOutCompletePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getButtonComplete(){
        return waits.visibilityOfElement(By.id("back-to-products"));
    }

}
