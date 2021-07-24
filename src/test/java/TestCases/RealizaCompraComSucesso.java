package TestCases;

import Framework.TestBase;
import Framework.Waits;
import Tasks.InventoryTask;
import Tasks.LoginTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private final WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        loginTask.realizarLogin();
        //inventoryTask.changeDropdownSelection();
        inventoryTask.selectItem();
    }

//    @Test
//    public void realizarCompraComSucesso2(){
//        loginTask.realizarLogin();
//        //inventoryTask.changeDropdownSelection();
//        inventoryTask.selectItem();
//    }
//
//    @Test
//    public void realizarCompraComSucesso3(){
//        loginTask.realizarLogin();
//        //inventoryTask.changeDropdownSelection();
//        inventoryTask.selectItem();
//    }

}
