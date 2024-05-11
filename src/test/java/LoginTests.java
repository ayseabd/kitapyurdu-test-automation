import Base.BaseTest;
import Pages.AccountPage;
import Pages.LoginPage;
import Pages.MainPage;
import com.beust.ah.A;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Login Test Senaryoları")
public class LoginTests extends BaseTest{

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void SuccesTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail("qatestdeneme@gmail.com")
                .fillPassword("kitapyurdudeneme")
                .clickLoginButton();
        accountPage
                .succesLoginPageControl("Hesabım");



    }
}
