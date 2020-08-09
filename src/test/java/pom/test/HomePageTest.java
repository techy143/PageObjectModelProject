package pom.test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void addToCart() throws InterruptedException {
        homePage.addToCart("Shopping cart (1 item)");
    }

    @Test(priority = 2)
    public void checkOut() throws InterruptedException{

        viewCartPage.checkOut("Shopping cart (1 item)");

        System.out.println("--------- Validation Passed -------------");

    }
}