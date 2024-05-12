package Pages;

import Base.BaseTest;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage extends BaseTest {

    By txtFirstName = By.name("firstname");
    By txtLastName = By.name("lastname");
    By txtEmail = By.name("email");
    By txtPassword = By.name("password");
    By txtPasswordConfirm = By.name("confirm");
    By checkTerms = By.className("ky-form-check-label");
    By checkCampaign = By.id("is_campaign_newsletter");
    By btnSignUp = By.xpath("//div[@class='ky-form-buttons']/button[contains(text(), 'Üye Ol')]");

    By lblExistUserError = By.cssSelector("[class='ky-error']");


    @Step("Ad Alanı Doldurulur.")
    public RegisterPage fillFirstName(String text) {
        driver.findElement(txtFirstName).sendKeys(text);
        return this;

    }

    @Step("Soyad Alanı Doldurulur")
    public RegisterPage fillLastName(String text) {
        driver.findElement(txtLastName).sendKeys(text);
        return this;
    }

    @Step("E-mail Alanı Doldurulur")
    public RegisterPage fillEmail(String text) {
        driver.findElement(txtEmail).sendKeys(text);
        return this;
    }

    @Step("Şifre Alanı Doldurulur")
    public RegisterPage fillPassword(String text) {
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step("Şifre Tekrar")
    public RegisterPage fillPasswordConfirm(String text) {
        driver.findElement(txtPasswordConfirm).sendKeys(text);
        return this;
    }

    @Step("Koşulları Kabul Et")
    public RegisterPage checkTerms() {
        driver.findElement(checkTerms).click();
        return this;
    }

    @Step("Kampanya Gönderilerini Kabul Et")
    public RegisterPage checkCampaign(){
        driver.findElement(checkCampaign).click();
        return this;
    }

    @Step("Üye Ol Butonuna Tıklanır")
    public RegisterPage clickSignUp(){
        driver.findElement(btnSignUp).click();
        return this;
    }

    @Step("Var Olan Kullanıcı Hatası")
    public RegisterPage existUserError(String errorMessage){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniye bekleyecek
        wait.until(ExpectedConditions.visibilityOfElementLocated(lblExistUserError));

        String text = driver.findElement(lblExistUserError).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

}

