package Pages;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class MainPage extends BaseTest {

    By btnLogin = By.xpath("//*[@class='menu-top-button login']");

    By btnRegister = By.xpath("//*[@class='menu-top-button register']");

    By searchBox = By.id("search-input");

    By btnSearch = By.cssSelector("[class='common-sprite button-search']");

    By profileMenu = By.cssSelector("[class='common-sprite']");

    By userAccount = By.xpath("//div[text()='Hesabım']");

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

    @Step("Arama Kutusuna Text Girilir")
    public MainPage fillSearchBox(String text){
        driver.findElement(searchBox).sendKeys(text);
        return this;
    }

    @Step("Search Butonuna Tıklanır")
    public MainPage clickSearchButton(){
        driver.findElement(btnSearch).click();
        return this;
    }

    

}
