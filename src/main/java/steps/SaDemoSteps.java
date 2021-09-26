package steps;

import impl.SaDemoImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverUtils;

public class SaDemoSteps {

    SaDemoImpl impl = new SaDemoImpl();

    @Given("I navigate to Saucedemo")
    public void i_navigate_to_saucedemo() {

        impl.navigateToSaucedemo();
    }

    @Then("I input username as {string}")
    public void iInputUsrenameAs(String userName) {

        impl.getPage().userName.sendKeys(userName);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {

        impl.getPage().loginBtn.click();
    }

    @Then("Verify error message {string}")
    public void verifyErrorMessage(String expectedErrorMsg) {

        String actualText = impl.getMsg();
        Assert.assertEquals(expectedErrorMsg, actualText);
    }

    @Then("I input password as {string}")
    public void iInputPasswordAs(String password) {

        impl.getPage().password.sendKeys(password);
    }

    @Then("Verify Swag Labs title")
    public void verifySwagLabsTitle() {

        String expected = "Swag Labs";
        Assert.assertTrue(WebDriverUtils.getDriver().getTitle().equals(expected));
    }
}

