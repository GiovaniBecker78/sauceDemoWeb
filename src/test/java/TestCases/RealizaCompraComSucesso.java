package TestCases;

import Framework.*;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private final WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);
    private CartTask cartTask = new CartTask(driver);
    private CheckOutOneTask checkOutOneTask = new CheckOutOneTask(driver);
    private CheckOutTwoTask checkOutTwoTask = new CheckOutTwoTask(driver);
    private CheckOutCompleteTask checkOutCompleteTask = new CheckOutCompleteTask(driver);

    @Test
    public void realizarCompraComSucesso1(){
        try{
            Report.createTest("Realizar Compra Com Sucesso1", ReportType.SINGLE);

            loginTask.realizarLogin();

            //inventoryTask.changeDropdownSelection();
            inventoryTask.selectItem();
            inventoryTask.addItem();
            inventoryTask.cartLink();
            cartTask.buttonCheckout();
            checkOutOneTask.addFirstName();
            checkOutOneTask.addLastName();
            checkOutOneTask.addPostalCode();
            checkOutOneTask.buttonContinue();
            //checkOutTwoTask.getTextFreeDelivery();
            checkOutTwoTask.finishBuy();
            checkOutCompleteTask.returnToHome();

        }catch(Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }




}
