package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Ebebek_Shopping {
    public Ebebek_Shopping() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//b[@id = 'txtProductTitle'])[2]")
    public WebElement getProductName;
    @FindBy(css = "[class = 'btn btn-add ng-star-inserted']")
    public WebElement addToCart;
    @FindBy(css = "[class = 'btn btn-add ng-star-inserted']")
    public List<WebElement> addToCartList;
    @FindBy(id = "btnShowCart")
    public WebElement showCart;
    @FindBy(id = "btnRemoveProduct")
    public WebElement removeFromCart;
    @FindBy(xpath = "//eb-cart-item/div/div[1]/div/a")
    public WebElement shoppingItemName;
    @FindBy(css = "[class = 'btn btn-primary btn-block btn-notify']")
    public WebElement geldiğindeHaberVer;
    @FindBy(id = "btnGoToShippingAddress")
    public WebElement completeShopping;
    @FindBy(id = "btnGoToShippingAddress")
    public List<WebElement> completeShoppingList;
    @FindBy(id = "btnSubmitLogin")
    public WebElement loginOrRegister;
}
