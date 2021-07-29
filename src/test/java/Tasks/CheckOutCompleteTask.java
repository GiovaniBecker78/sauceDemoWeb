package Tasks;

import PageObjects.CheckOutCompletePage;
import org.openqa.selenium.WebDriver;

public class CheckOutCompleteTask {
    private WebDriver driver;
    private CheckOutCompletePage checkOutCompletePage;

    public CheckOutCompleteTask(WebDriver driver){
        this.driver = driver;
        checkOutCompletePage = new CheckOutCompletePage(driver);
    }

    public void returnToHome(){
        checkOutCompletePage.getButtonComplete().click();
    }

}
