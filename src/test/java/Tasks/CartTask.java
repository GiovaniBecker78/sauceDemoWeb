package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CartPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartTask {
    private final WebDriver driver;
    private final CartPage cartPage;

    public CartTask(WebDriver driver) {
        this.driver = driver;
        cartPage = new CartPage(driver);
    }

    public void buttonCheckout(){
        cartPage.getButtonCheckout().click();
    }

    public void confirmCartPage(){
        cartPage.getConfirmPageCart().getText();
        validaCartPage();
    }

    public void validaCartPage(){
        try{
            String textoCartPage = cartPage.getConfirmPageCart().getText();
            Assertions.assertEquals("YOUR CART",textoCartPage);
            Report.log(Status.PASS,"Confirmar produtos no carrinho. ", Screenshot.fullPageBase64(driver));
        }catch(Exception e){
            Report.log(Status.FAIL, "Página não foi carregada", Screenshot.fullPageBase64(driver));
        }
    }

}
