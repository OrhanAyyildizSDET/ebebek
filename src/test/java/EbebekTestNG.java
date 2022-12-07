import org.apache.commons.collections4.Get;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Ebebek_Shopping;
import pages.Ebebek_main;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class EbebekTestNG {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Ebebek_main ebebek_main = new Ebebek_main();
    Ebebek_Shopping ebebek_shopping = new Ebebek_Shopping();

    @Test
    public void testEbebek() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("site_url"));

        wait.until(ExpectedConditions.visibilityOf(ebebek_main.closeButtonForAdvices));
        ebebek_main.closeButtonForAdvices.click();

        ebebek_main.searchBox.sendKeys("kaşık maması");
        ebebek_main.searchBox.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(ebebek_main.products1));
        try {
            long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

            while (true) {
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(3000);

                long newHeight = (long) js.executeScript("return document.body.scrollHeight");
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(ebebek_main.lastProduct));

        js.executeScript("arguments[0].scrollIntoView(true);", ebebek_main.lastProduct);
        js.executeScript("arguments[0].click();",ebebek_main.lastProduct);

        String productNameExpected = ebebek_shopping.getProductName.getText();

        js.executeScript("arguments[0].click();",ebebek_shopping.addToCart);
        wait.until(ExpectedConditions.elementToBeClickable(ebebek_shopping.showCart));
        js.executeScript("arguments[0].click();",ebebek_shopping.showCart);
        Assert.assertEquals(productNameExpected, ebebek_shopping.shoppingItemName.getText());

        js.executeScript("arguments[0].click();",ebebek_shopping.completeShopping);
        wait.until(ExpectedConditions.elementToBeClickable(ebebek_shopping.loginOrRegister));
        Assert.assertTrue(ebebek_shopping.loginOrRegister.isDisplayed());

        Driver.closeDriver();
    }
}
