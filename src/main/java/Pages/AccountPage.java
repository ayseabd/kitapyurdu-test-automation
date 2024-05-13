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

    By btnUserAccountInfo = By.xpath("//html/body/div[5]/div/div[3]/div[2]/div[1]/a[1]/span[contains(text(), 'Hesap Bilgilerim')]");

    By lblUserAccountPage = By.cssSelector("[id ='content'] h1");

    By firstName = By.name("firstname");

    By lastName = By.name("lastname");

    By btnUpdate = By.id("button");

    By lblUpdateSucces = By.id("notification");


    @Step("Başarılı giriş sayfa kontrolü.")
    public AccountPage succesLoginPageControl(String title) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniye bekleyecek
        wait.until(ExpectedConditions.visibilityOfElementLocated(objTitle));

        String text = driver.findElement(objTitle).getText();
        Assert.assertEquals(title, text);
        return this;
    }

    @Step("Hesap Bilgilerim Butonuna Tıklanır")
    public AccountPage clickUserAccountInfo() {
        driver.findElement(btnUserAccountInfo).click();
        return this;
    }

    @Step("Hesap Bilgilerim Sayfa Kontrolü")
    public AccountPage checkUserAccountInfo(String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 saniye bekleyecek
        wait.until(ExpectedConditions.visibilityOfElementLocated(lblUserAccountPage));

        String text = driver.findElement(lblUserAccountPage).getText();
        Assert.assertEquals(text, title);
        return this;
    }

    @Step("Firstname Bilgisi Güncellenir")
    public AccountPage updateFirstname(String text) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(text);
        return this;
    }

    @Step("Firstname Bilgisi Güncellenir")
    public AccountPage updateLastname(String text) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(text);
        return this;
    }

    @Step("Güncelle Butonuna Tıklanır")
    public AccountPage clickUpdateButton(){
        driver.findElement(btnUpdate).click();
        return this;
    }

    @Step("Başarılı Güncelleme Bildirimi Görüntülenir")
    public AccountPage succesUpdateNotification(String notification){
        String text = driver.findElement(lblUpdateSucces).getText();
        Assert.assertEquals(text, notification);
        return this;
    }
}
