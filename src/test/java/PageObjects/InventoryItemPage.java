package PageObjects;

import Framework.Waits;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage {
    private WebDriver driver;
    private Waits waits;

    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }



}
