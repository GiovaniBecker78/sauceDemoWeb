package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckOutOnePage;
import Utils.FakerGenerator;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import java.util.Locale;

public class CheckOutOneTask {
    private WebDriver driver;
    private CheckOutOnePage checkOutOnePage;//isso

    public CheckOutOneTask(WebDriver driver) {//construtor aqui e bla bla
        this.driver = driver;
        checkOutOnePage = new CheckOutOnePage(driver);
    }
//entendeu o javafaker?

    public void dataInfo(){
        checkOutOnePage.getFirstName().sendKeys(FakerGenerator.getFirstName());
        checkOutOnePage.getLastName().sendKeys(FakerGenerator.getLastName());
        checkOutOnePage.getPostalCode().sendKeys(FakerGenerator.getPostalCode());
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
