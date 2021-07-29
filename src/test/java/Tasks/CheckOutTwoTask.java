package Tasks;


import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckOutTwoPage;
import com.aventstack.extentreports.Status;
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
        validaFinalCompra();
        checkOutTwoPage.getButtonFinish().click();
    }

    public void validaFinalCompra(){
        try{
            String textoExtraido = checkOutTwoPage.getTextItemBuy().getText();
            Assertions.assertEquals("CHECKOUT: OVERVIEW", textoExtraido);
            Report.log(Status.PASS,"Confirmar compra efetuada. ", Screenshot.fullPageBase64(driver));
        }catch(Exception e){
            Report.log(Status.FAIL, "Página não carregou", Screenshot.fullPageBase64(driver));
        }
    }

}
