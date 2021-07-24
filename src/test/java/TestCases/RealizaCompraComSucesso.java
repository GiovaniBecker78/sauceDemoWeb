package TestCases;

import Framework.*;
import Tasks.InventoryTask;
import Tasks.LoginTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private final WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);

    @Test
    public void realizarCompraComSucesso1(){
        try{
            Report.createTest("Realizar Compra Com Sucesso1", ReportType.SINGLE);

            loginTask.realizarLogin();
            //inventoryTask.changeDropdownSelection();
            inventoryTask.selectItem();
        }catch(Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }




}
