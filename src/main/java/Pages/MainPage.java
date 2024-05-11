package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    By btnLogin = By.xpath("//*[@class='menu-top-button login']");

    By btnRegister = By.xpath("//*[@class='menu-top-button register']");

    @Step("Giriş Yap Butonuna Tıklanır")
    public MainPage clickLoginMenu() {
        driver.findElement(btnLogin).click();
        return this;
    }

    @Step("Üye Ol Butonuna Tıklanır")
    public MainPage clickRegisterMenu(){
        driver.findElement(btnRegister).click();
        return this;
    }

}
