package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Ebebek_Shopping;
import pages.Ebebek_main;
import utilities.Driver;

import javax.swing.text.html.Option;
import java.time.Duration;

public class EbebekStepDefs {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(Driver.getDriver());
    Ebebek_main ebebek_main = new Ebebek_main();
    Ebebek_Shopping ebebek_shopping = new Ebebek_Shopping();
    String mainPageItemName;
    @Given("user go to the {string} page")
    public void user_go_to_the_page(String url) throws InterruptedException {
        Driver.getDriver().get(url);
    }
    @When("user click the searchbox")
    public void user_click_the_searchbox() {

    }
    @When("user enter the word {string} and click enter")
    public void user_enter_the_word_and_click_enter(String string) {
        ebebek_main.searchBox.sendKeys("biberon");
        ebebek_main.searchBox.sendKeys(Keys.ENTER);
    }
    @When("user select the first item")
    public void user_select_the_first_item() {
        ebebek_main.products1.click();
        mainPageItemName = ebebek_shopping.getProductName.getText();        ;
    }
    @When("user click the {string} and {string} button")
    public void user_click_the_button(String ekle,String gör) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(ebebek_shopping.addToCart)).click();
        wait.until(ExpectedConditions.visibilityOf(ebebek_shopping.showCart)).click();
    }
    @Then("user check the basket")
    public void user_check_the_basket() {
        wait.until(ExpectedConditions.visibilityOf(ebebek_shopping.shoppingItemName));
        String shoppingPageItemName = ebebek_shopping.shoppingItemName.getText();
        Assert.assertEquals(mainPageItemName,shoppingPageItemName);
    }

}
