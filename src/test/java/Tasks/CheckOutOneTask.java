package Tasks;


import PageObjects.CheckOutOnePage;
import org.openqa.selenium.WebDriver;

public class CheckOutOneTask {
    private WebDriver driver;
    private CheckOutOnePage checkOutOnePage;


    public CheckOutOneTask(WebDriver driver) {
        this.driver = driver;
        checkOutOnePage = new CheckOutOnePage(driver);
    }

    public void addFirstName(){
        checkOutOnePage.getFirstName().sendKeys("Giovani");
    }

    public void addLastName(){
        checkOutOnePage.getLastName().sendKeys("Becker");
    }

    public void addPostalCode(){
        checkOutOnePage.getPostalCode().sendKeys("91795-430");
    }

    public void buttonContinue(){
        checkOutOnePage.buttonContinue().click();
    }






}
