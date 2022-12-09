package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ebebek_main {
    public Ebebek_main() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[class = 'ins-close-button-container-c2703']")
    public WebElement closeButtonForAdvices;
    @FindBy(css = "[class = 'EbebekSiteLoginMenu has-components']")
    public WebElement account;
    @FindBy(css = "[class = 'orangeBackground']")
    public WebElement accountOpen;
    @FindBy(id = "txtSearchBox")
    public WebElement searchBox;
    @FindBy(xpath = "//eb-product-list-item[1]")
    public WebElement products1;
    @FindBy(css = "[href = '/mycey-360-derece-donen-bebek-mama-kasigi-p-myc-m06201-203']")
    public WebElement lastProduct;
}
