package steps;

import impl.SaDemoImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SaDemoSteps {

    SaDemoImpl impl = new SaDemoImpl();

    String actual;

    @Given("I navigate to Saucedemo")
    public void i_navigate_to_saucedemo() {

        impl.navigateToSaucedemo();
    }

    @Then("I input username as {string}")
    public void iInputUsrenameAs(String userName) {

        impl.getPage().userName.sendKeys(userName);
    }

    @Then("Verify error message {string}")
    public void verifyErrorMessage(String expectedErrorMsg) {

        actual = impl.getMsg();
        Assert.assertEquals(expectedErrorMsg, actual);
    }

    @Then("I input password as {string}")
    public void iInputPasswordAs(String password) {

        impl.getPage().password.sendKeys(password);
    }

    @Then("Verify {string} title")
    public void verifyTitle(String expectedTitle) {

        actual = impl.getTitle();
        Assert.assertEquals(expectedTitle, actual);
    }

    @Then("Verify {int} items")
    public void verifyItems(int number) {

        Assert.assertTrue(impl.getPage().items.size() == number);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String button) {

        impl.clickButton(button);
    }

    @And("Verify {string} button")
    public void verifyButton(String expectedText) {

        actual = impl.getAddRemoveText(expectedText);
        Assert.assertEquals(actual, expectedText);
    }

    @Then("Verify social media buttons are working")
    public void verifySocialMediaButtonsAreWorking() {

        List<WebElement> socialBtnList = impl.getPage().socialBtn;
        for (int s = 0; s < socialBtnList.size(); s++) {
            Assert.assertTrue(impl.getPage().socialBtn.get(s).isEnabled());
            impl.getPage().socialBtn.get(s).click();
        }
    }
}