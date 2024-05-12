package Pages;


import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AccountPage extends BaseTest {

    By objTitle = By.xpath("//*[@id=\"content\"]/h1");



    @Step("Başarılı giriş sayfa kontrolü.")
    public AccountPage succesLoginPageControl(String title) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniye bekleyecek
        wait.until(ExpectedConditions.visibilityOfElementLocated(objTitle));

        String text = driver.findElement(objTitle).getText();
        Assert.assertEquals(title, text);
        return this;
    }


}
