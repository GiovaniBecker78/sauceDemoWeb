package Tasks;

import Utils.Highlights;
import Framework.Report;
import Framework.Screenshot;
import PageObjects.LoginPage;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    //Construtor da classe...
    public LoginTask(WebDriver driver){
        this.driver = driver;//
        loginPage = new LoginPage(driver);
    }

    public void realizarLogin(){
        String user = FileOperations.getProperties("loginData").getProperty("user");
        String password = FileOperations.getProperties("loginData").getProperty("password");

        //loginPage.getUsernameTextField().sendKeys(FileOperations.getProperties("loginData").getProperty("user"));
        //loginPage.getPasswordTextField().sendKeys(FileOperations.getProperties("loginData").getProperty("password"));

        loginPage.getUsernameTextField().sendKeys(user);
        loginPage.getPasswordTextField().sendKeys(password);
        verificaCarregamentoLogin();
        loginPage.getLoginButton().click();
    }

    public void verificaCarregamentoLogin(){
        try{
            boolean imagemOn = loginPage.getLoginImage().isDisplayed();

            Assertions.assertTrue(imagemOn);
            Highlights.highlighterMethod(driver, loginPage.getLoginImage(), "red");

            Report.log(Status.PASS,"Confirma login com sucesso", Screenshot.fullPageBase64(driver));
        }catch(Exception e){
            Report.log(Status.FAIL,"Página de login não foi carregada", Screenshot.fullPageBase64(driver));
        }
    }

    public void realizarLoginParametrizado(String usuario, String senha){
        loginPage.getUsernameTextField().sendKeys(usuario);
        loginPage.getPasswordTextField().sendKeys(senha);
        verificaCarregamentoLogin();
        loginPage.getLoginButton().click();
    }





}
