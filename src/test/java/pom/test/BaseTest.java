package pom.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pom.project.ViewCartPage;
import pom.project.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public HomePage homePage;
    public WebDriver driver;
    public ViewCartPage viewCartPage;


    @BeforeClass
    public void setUpMethod() {
        initilization();
        homePage = new HomePage(driver);
        viewCartPage = new ViewCartPage(driver);

    }

    public void initilization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");

    }

    @AfterClass
    public void tearDownMethod() {

        if (driver != null) {
            driver.quit();
        }
    }
}
