package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

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

}