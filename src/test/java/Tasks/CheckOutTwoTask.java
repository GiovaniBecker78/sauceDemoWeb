package Tasks;


import PageObjects.CheckOutTwoPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckOutTwoTask {
    private WebDriver driver;
    private CheckOutTwoPage checkOutTwoPage;

    public CheckOutTwoTask(WebDriver driver){
        this.driver = driver;
        checkOutTwoPage = new CheckOutTwoPage(driver);
    }

    public void finishBuy(){
        checkOutTwoPage.getButtonFinish().click();
    }

    public void getTextFreeDelivery(){
        String textoExtraido = checkOutTwoPage.getTextFreeExpressDelivery().getText();
        Assertions.assertEquals("FREE PONY EXPRESS DELIVERY!", textoExtraido);
    }



}
