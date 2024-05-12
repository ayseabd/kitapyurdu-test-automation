import Base.BaseTest;
import Pages.AccountPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class UserAccountTests extends BaseTest {

    MainPage mainPage = new MainPage();
    AccountPage accountPage = new AccountPage();
@Feature("Kullanıcı Hesap Ayarları Test Senaryoları")

    @Test(description = "Kullanıcı Hesap Bilgilerini Güncelleme Testi")
    public void UserUpdateTEST(){

    }
}
