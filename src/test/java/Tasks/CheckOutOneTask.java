package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckOutOnePage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import java.util.Locale;

public class CheckOutOneTask {
    private WebDriver driver;
    private CheckOutOnePage checkOutOnePage;

    public CheckOutOneTask(WebDriver driver) {
        this.driver = driver;
        checkOutOnePage = new CheckOutOnePage(driver);
    }

    public void informarDados(){
        checkOutOnePage.getFirstName().sendKeys("Giovani");
        checkOutOnePage.getLastName().sendKeys("Becker");
        checkOutOnePage.getPostalCode().sendKeys("91795-430");
        validaDadosInformados();
    }

    public void buttonContinue(){
        checkOutOnePage.buttonContinue().click();
    }

    public void validaDadosInformados(){
        try{
            String texto = checkOutOnePage.getConfirmPageInformation().getTagName();
            Assertions.assertEquals("button",texto);
            Report.log(Status.PASS,"Confirmar informações do comprador. ", Screenshot.fullPageBase64(driver));
        }catch(Exception e){
            Report.log(Status.FAIL,"página não carregou!", Screenshot.fullPageBase64(driver));
        }
    }

}
