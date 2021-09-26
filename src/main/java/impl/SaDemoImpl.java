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
}
