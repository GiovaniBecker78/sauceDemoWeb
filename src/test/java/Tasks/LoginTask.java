package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    //Construtor da classe...
    public LoginTask(WebDriver driver){
        this.driver = driver;//
        loginPage = new LoginPage(driver);
    }

    public void realizarLogin(){
        loginPage.getUsernameTextField().sendKeys("standard_user");
        loginPage.getPasswordTextField().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }

}
