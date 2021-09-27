package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;
import java.util.List;

public class SaDemoPage {

    public SaDemoPage() {

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(css = "input#user-name")
    public WebElement userName;

    @FindBy(css = "input#password")
    public WebElement password;

    @FindBy(css = "input#login-button")
    public WebElement loginBtn;

    @FindBy(css = "h3[data-test='error']")
    public WebElement errorMsg;

    @FindBy(css = "div[class='inventory_item_name']")
    public List<WebElement> items;

    @FindBy(css = "button[id^=add-to-cart]")
    public WebElement addBtn;

    @FindBy(css = " button[id^='remove']")
    public WebElement removeBtn;

    @FindBy(css = "ul[class='social'] > li")
    public List<WebElement> socialBtn;

}