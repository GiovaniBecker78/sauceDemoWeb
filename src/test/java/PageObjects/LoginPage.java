package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver dirver;
    private Waits waits;

    //Construtor da classe...
    public LoginPage(WebDriver dirver){
        this.dirver = dirver;
        waits = new Waits(dirver);
    }

    public WebElement getUsernameTextField(){
        return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPassordTextField(){
        return waits.visibilityOfElement(By.xpath("//*[@data-test='password']"));
    }

    public WebElement getLoginButton(){
        return waits.visibilityOfElement(By.xpath("//*[@data-test='logi-button']"));
    }





}
