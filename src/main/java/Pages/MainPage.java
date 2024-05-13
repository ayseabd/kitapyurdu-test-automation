package Pages;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainPage extends BaseTest {

    By btnLogin = By.xpath("//*[@class='menu-top-button login']");

    By btnRegister = By.xpath("//*[@class='menu-top-button register']");

    By searchBox = By.id("search-input");

    By btnSearch = By.cssSelector("[class='common-sprite button-search']");

    By profileMenu = By.className("common-sprite");

    By userAccount = By.xpath("//html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[1]/a[contains(text(), 'Hesabım')]");
  //  By userAccount = By.xpath("//div[@class='menu top login']//ul//li//a//div//ul//li//a[contains(text(), 'Hesabım')]");
//html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[1]/a

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

    @Step("Hesap Ayarlarına Tıklanır")
    public MainPage goToUserAccount(){
        Actions actions = new Actions(driver);

        WebElement profileMenuElement = driver.findElement(profileMenu);
        actions.moveToElement(profileMenuElement).perform();

        WebElement userAccountElement = driver.findElement(userAccount);
        userAccountElement.click();
        return this;
    }


}
