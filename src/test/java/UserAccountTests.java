import Base.BaseTest;
import Pages.AccountPage;
import Pages.LoginPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class UserAccountTests extends BaseTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Feature("Kullanıcı Hesap Ayarları Test Senaryoları")

    @Test(description = "Kullanıcı Hesap Bilgilerini Güncelleme Testi")
    public void UserUpdateTEST() {
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail(email)
                .fillPassword(password)
                .clickLoginButton();
        accountPage
                .succesLoginPageControl("Hesabım");
        mainPage
                .goToUserAccount();
        accountPage
                .clickUserAccountInfo()
                .checkUserAccountInfo(userAccountInfoText)
                .updateFirstname("yeni kitapyurdu")
                .updateLastname("yeni deneme")
                .clickUpdateButton()
                .succesUpdateNotification(updateSuccesNotification);
    }
}
