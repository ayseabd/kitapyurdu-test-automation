package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    By txtEmail = By.name("email");

    By txtPassword = By.name("password");

    By btnLogin = By.xpath("//div[@class='ky-form-buttons']/button[contains(text(), 'Giriş Yap')]");




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
}
