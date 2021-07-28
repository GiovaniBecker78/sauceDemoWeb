package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutTwoPage {
    private WebDriver driver;
    private Waits waits;

    public CheckOutTwoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getTextFreeExpressDelivery(){
        return waits.visibilityOfElement(By.xpath("//*[@class='summary_info']/div[3]"));
    }

    public WebElement getButtonFinish(){
        return waits.visibilityOfElement(By.id("finish"));
    }

    //*[@class='summary_info']



}
