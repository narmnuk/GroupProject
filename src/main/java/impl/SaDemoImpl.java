package impl;

import pages.SaDemoPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class SaDemoImpl {

    private SaDemoPage saDemoPage;

    public SaDemoPage getPage() {

        if (saDemoPage == null)
            saDemoPage = new SaDemoPage();

        return saDemoPage;
    }

    public void navigateToSaucedemo() {

        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public String getMsg() {

        return getPage().errorMsg.getText();
    }

    public String getTitle() {

        return WebDriverUtils.getDriver().getTitle();
    }

    public void clickButton(String button) {

        switch (button.toLowerCase()) {
            case "login":
                getPage().loginBtn.click();
                break;
            case "add to cart":
                getPage().addBtn.click();
                break;
            case "remove":
                getPage().removeBtn.click();
                break;
        }
    }

    public String getAddRemoveText(String text) {

        String actualText = "";
        switch (text.toLowerCase()) {
            case "add to cart":
                actualText = getPage().addBtn.getText();
                break;
            case "remove":
                actualText = getPage().removeBtn.getText();
                break;
        }

        return actualText;
    }
}