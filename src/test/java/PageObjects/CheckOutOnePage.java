package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutOnePage {
    private final WebDriver driver;
    private final Waits waits;

    public CheckOutOnePage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getFirstName(){
        return waits.visibilityOfElement(By.id("first-name"));
    }

    public WebElement getLastName(){
        return waits.visibilityOfElement(By.id("last-name"));
    }

    public WebElement getPostalCode(){
        return waits.visibilityOfElement(By.id("postal-code"));
    }

    public WebElement buttonContinue(){
        return waits.visibilityOfElement(By.id("continue"));
    }

    public WebElement getConfirmPageInformation(){
        return waits.visibilityOfElement(By.id("cancel"));
    }

}
