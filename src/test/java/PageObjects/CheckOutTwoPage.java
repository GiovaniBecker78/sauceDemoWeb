package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutTwoPage {
    private WebDriver driver;
    private Waits waits;

    public CheckOutTwoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getTextItemBuy(){
        return waits.visibilityOfElement(By.className("header_secondary_container"));
    }

    public WebElement getButtonFinish(){
        return waits.visibilityOfElement(By.id("finish"));
    }

}
