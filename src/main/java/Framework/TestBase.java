package Framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase extends DriverManager{
    private static WebDriver driver;

    public static WebDriver getDriver(){
        driver = getDriver(TypeDriver.FIREFOX);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        getDriver().get("https://www.saucedemo.com/");
        //getDriver().get(Paths.BASE_URL);
    }

    @AfterEach
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        //Report.close();
        quitDriver();
    }

}