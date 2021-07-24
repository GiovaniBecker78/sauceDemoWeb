package Tasks;

import PageObjects.InventoryItemPage;
import PageObjects.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryTask {
    private WebDriver driver;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;

    public InventoryTask(WebDriver driver) {
        this.driver = driver;
        inventoryPage = new InventoryPage(driver);
        inventoryItemPage = new InventoryItemPage(driver);
    }

    public void changeDropdownSelection(){
        inventoryPage.getDropdownSort().selectByValue("hilo");/*.selectByIndex(2);*/
    }

    public void selectItem(){
        inventoryPage.getSauceLabsBackpackImageLink().click();
        validaNextPage();

    }

    public void validaNextPage(){
        String textoExtraido = inventoryItemPage.getItemNameTextField().getText();
        Assertions.assertEquals("Sauce Labs Backpack", textoExtraido);
    }


}
