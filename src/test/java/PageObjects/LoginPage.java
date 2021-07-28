package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private final Waits waits;

    //Construtor da classe...
    public LoginPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getUsernameTextField(){

        return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField(){

        return waits.visibilityOfElement(By.xpath("//*[@data-test='password']"));
    }

    public WebElement getLoginButton(){

        return waits.visibilityOfElement(By.xpath("//*[@data-test='login-button']"));
    }


    public WebElement getLoginImage(){

        return waits.visibilityOfElement(By.xpath("//*[@class='bot_column']"));
    }


}
