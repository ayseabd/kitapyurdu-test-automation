package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BaseTest {
    By txtEmail = By.name("email");

    By txtPassword = By.name("password");

    By btnLogin = By.xpath("//div[@class='ky-form-buttons']/button[contains(text(), 'Giriş Yap')]");

    By lblInvalidEmailOrPassword = By.cssSelector("[class='ky-error']");

    @Step("Email alanı doldurulur.")
    public LoginPage fillEmail(String text) {
        driver.findElement(txtEmail).sendKeys(text);
        return this;
    }

    @Step("Password alanı doldurulur.")
    public LoginPage fillPassword(String text) {
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step("Giriş yap butonuna tıklanır.")
    public LoginPage clickLoginButton() {
        driver.findElement(btnLogin).click();
        return this;
    }

    @Step("Hatalı Email/Şifre Uyarısı")
    public LoginPage invalidInformationErrorMessageControl(String errorMessage) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniye bekleyecek
        wait.until(ExpectedConditions.visibilityOfElementLocated(lblInvalidEmailOrPassword));

        String text = driver.findElement(lblInvalidEmailOrPassword).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }
    @Step("Boş Email Alanı.")
    public LoginPage clearEmail() {
        driver.findElement(txtEmail).clear();
        return this;
    }
    @Step("Boş Şifre Alanı.")
    public LoginPage clearPassword() {
        driver.findElement(txtPassword).clear();
        return this;
    }
}
