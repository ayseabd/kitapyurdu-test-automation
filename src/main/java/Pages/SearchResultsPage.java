package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SearchResultsPage extends BaseTest {

    By lblResults = By.className("results");
    By lblEmptyResults = By.className("product-not-found");
    By lblSearchMatch = By.className("name");


    @Step("Arama Sonuç Getirdi")
    public SearchResultsPage searchFound(String searchFoundText) {
        String text = driver.findElement(lblResults).getText();
        Assert.assertTrue(text.matches(searchFoundText));
        return this;
    }

    @Step("Arama Sonuç Getirmedi")
    public SearchResultsPage searchNotFound(String searchNotFoundText) {
        String text = driver.findElement(lblEmptyResults).getText();
        Assert.assertTrue(text.contains(searchNotFoundText));
        return this;
    }

    @Step("Arama ve Sonuç Eşleşmesi")
    public SearchResultsPage searchMatch() {
        String text = driver.findElement(lblSearchMatch).getText();
        Assert.assertTrue(text.contains(searchMatchText));
        return this;
    }
}
