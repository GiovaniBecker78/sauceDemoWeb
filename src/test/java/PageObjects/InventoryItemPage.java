package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {
    private WebDriver driver;
    private Waits waits;

    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getItemNameTextField(){
        return waits.visibilityOfElement(By.cssSelector(".inventory_details_name.large_size"));//'.' antes e no espaço entre name e large
    }

    public WebElement addButtonSauceLabsPack(){
        return waits.visibilityOfElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getCartLink(){

        return waits.visibilityOfElement(By.className("shopping_cart_link"));
    }

}
