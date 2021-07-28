package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private final WebDriver driver;
    private final Waits waits;

    //Construtor da classe...
    public CartPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getButtonCheckout(){
        return waits.visibilityOfElement(By.id("checkout"));
    }





}
