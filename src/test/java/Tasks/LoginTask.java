package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver dirver;
    private LoginPage loginPage;

    //Construtor da classe...
    public LoginTask(WebDriver dirver){
        this.dirver = dirver;//
        loginPage = new LoginPage(dirver);
    }

    public void realizarLogin(){
        loginPage.getUsernameTextField().sendKeys("standard_user");
        loginPage.getPasswordTextField().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }



}
