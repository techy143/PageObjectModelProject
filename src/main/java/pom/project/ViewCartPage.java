package pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage extends BasePage {
    WebDriver driver;

    public ViewCartPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver,this);

    }

    public void checkOut (String expectedString) throws InterruptedException{

    }
}