package pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.text.BreakIterator;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(linkText = "Electronics")
    WebElement electronicsIteam;
    @FindBy(linkText = "Camera, Drones & Photo")
    WebElement iteamToBuy;
    @FindBy(linkText = "DSLR Cameras")
    WebElement camera;
    @FindBy(linkText = "Nikon")
    WebElement cameraBrand;
    @FindBy(linkText = "Nikon D5600")
    WebElement cameraModel;
    @FindBy(xpath = "(//h3[@class='s-item__title'])[1]")
    WebElement buyIt;
    @FindBy(xpath = "(//a[@class='btn btn--large btn--faux btn--fluid atc-link'])[1]")
    WebElement buyItNow;
    @FindBy(xpath = "//a[@id='tab-panel-0-w5-w0-atcBtn']")
    WebElement viewCart;

//Method for Homepage

    public void addToCart(String expectedString) throws InterruptedException {

        clickOnElement(electronicsIteam);
        System.out.println("Clicked on Electronics");

        clickOnElement(iteamToBuy);
        System.out.println("Clicked on Camera, Drones & Photo");

        clickOnElement(camera);
        Thread.sleep(3000);
        System.out.println("Clicked on DSLR Cameras");

        clickOnElement(cameraBrand);
        System.out.println("Clicked on Nikon Camera");

        clickOnElement(cameraModel);
        System.out.println("Clicked on Nikon D5600");

        clickOnElement(buyIt);
        System.out.println("clicked on Nikon D5600 DSLR Camera");

        clickOnElement(buyItNow);
        System.out.println("Clicked on Buy it Now");

        clickOnElement(viewCart);
        System.out.println("viewed cart");

    }
}