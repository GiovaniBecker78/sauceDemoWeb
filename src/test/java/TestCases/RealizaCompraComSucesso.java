package TestCases;

import Framework.*;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private final WebDriver driver = getDriver();

    private final LoginTask loginTask = new LoginTask(driver);
    private final InventoryTask inventoryTask = new InventoryTask(driver);
    private final CartTask cartTask = new CartTask(driver);
    private final CheckOutOneTask checkOutOneTask = new CheckOutOneTask(driver);
    private final CheckOutTwoTask checkOutTwoTask = new CheckOutTwoTask(driver);
    private final CheckOutCompleteTask checkOutCompleteTask = new CheckOutCompleteTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try{
            Report.createTest("Realizar Compra Com Sucesso", ReportType.SINGLE);
            loginTask.realizarLogin();
            inventoryTask.selectItem();
            inventoryTask.addItem();
            inventoryTask.cartLink();
            cartTask.confirmaPaginaCarrinho();
            cartTask.buttonCheckout();
            checkOutOneTask.informarDados();
            checkOutOneTask.buttonContinue();
            checkOutTwoTask.finishBuy();
            checkOutCompleteTask.returnToHome();

        }catch(Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }

}
