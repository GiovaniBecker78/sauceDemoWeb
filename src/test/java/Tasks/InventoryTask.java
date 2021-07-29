package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.InventoryItemPage;
import PageObjects.InventoryPage;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
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
        String mochilaTexto = inventoryPage.getSauceLabsBackPackTextField().getText();
        FileOperations.setProperties("data","itemName",mochilaTexto);
        inventoryPage.getSauceLabsBackpackImageLink().click();
        validaNextPage();
    }

    public void addItem(){
        inventoryPage.addButtonSauceLabsPack().click();
    }

    public void cartLink(){
        inventoryItemPage.getCartLink().click();
    }

    public void validaNextPage(){
        try {
            String textoExtraido = inventoryItemPage.getItemNameTextField().getText();
            Assertions.assertEquals("Sauce Labs Backpack", textoExtraido);
            Report.log(Status.PASS,"Confirmar item selecionado. ", Screenshot.fullPageBase64(driver));//Screenshot.fullPageBase64(driver)
        }catch(Exception e){
            Report.log(Status.FAIL, "Página não foi carregada", Screenshot.fullPageBase64(driver));//Screenshot.fullPageBase64(driver)

        }
    }





}
