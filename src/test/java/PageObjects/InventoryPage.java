package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    private WebDriver driver;
    private Waits waits;

    public InventoryPage(WebDriver dirver) {
        this.driver = driver;
        waits = new Waits(dirver);
    }


    public Select getDropdownSort(){
        return new Select(waits.visibilityOfElement(By.className("product_sort_container")));
    }

    public WebElement getSauceLabsBackpackImageLink(){
        return waits.visibilityOfElement(By.id("item_4_img_link"));
    }

//    public WebElement getSauceLabsBackPackTextField(){
//        return waits.visibilityOfElement(By.xpath("//*[@id='item_4_title_link']/div"));
//    }






}
