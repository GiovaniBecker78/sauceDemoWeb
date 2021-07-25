package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.InventoryTask;
import Tasks.LoginTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucessoDataProvider extends TestBase {

    private final WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);

    /* @ParameterizedTest , @CsvFileSource , numLinesToSkip = 1(para ignorar a primeira linha)
    O Data Driven Testing permite a criação de casos de teste
    positivos e negativos em um único teste. Na estrutura de
    automação de testes baseada em dados, os dados de entrada podem ser
    armazenados em fontes de dados únicas ou múltiplas, como xls, xml,
    csv e bancos de dados.
    */


    @ParameterizedTest//Teste DDT(Data Driven Testing)
    @MethodSource("Utils.DataClass#loginTestData")
    public void realizarCompraComSucessoDataProvider(String usuario, String senha){
        try{
            Report.createTest("Realizar Compra Com Sucesso1", ReportType.SINGLE);

            loginTask.realizarLoginParametrizado(usuario,senha);


        }catch(Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }
}
