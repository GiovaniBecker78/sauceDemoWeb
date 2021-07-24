package Tasks;

import PageObjects.InventoryPage;
import org.openqa.selenium.WebDriver;

public class InventoryTask {
    private WebDriver driver;
    private InventoryPage inventoryPage;

    public InventoryTask(WebDriver driver) {
        this.driver = driver;
        inventoryPage = new InventoryPage(driver);
        //inventoryItemPage = new InventoryItemPage(driver);
    }

    public void changeDropdownSelection(){
        inventoryPage.getDropdownSort().selectByValue("hilo");/*.selectByIndex(2);*/
    }

    public void selectItem(){
        inventoryPage.getSauceLabsBackpackImageLink().click();

    }


}
