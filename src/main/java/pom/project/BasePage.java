package pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
    //This method clicks on elements
    public void clickOnElement (WebElement element) throws InterruptedException {

        Thread.sleep(2000);
        element.click();

    }

    //This method types a String a textBox

    public void typeOnTextBox (WebElement element, String textToBeEntered) {

        element.sendKeys(textToBeEntered);

    }

    //This method is for checking a checkbox

    public void clickOnCheckbox (WebElement element){

        element.click();
    }
}