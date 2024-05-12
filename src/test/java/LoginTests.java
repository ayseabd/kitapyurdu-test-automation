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
    public void SuccesLoginTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail("qatestdeneme@gmail.com")
                .fillPassword("kitapyurdudeneme")
                .clickLoginButton();
        accountPage
                .succesLoginPageControl("Hesabım");
    }
    @Test(description = "Yanlış Email Testi")
    public void InvalidEmailTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail("qatestdenemedeneme@gmail.com")
                .fillPassword("kitapyurdudeneme")
                .clickLoginButton()
                .invalidInformationErrorMessageControl(invalidInformationErrorMessage);
    }

    @Test(description = "Yanlış Şifre Testi")
    public void InvalidPasswordTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail("qatestdeneme@gmail.com")
                .fillPassword("kitapyurdudenemedeneme")
                .clickLoginButton()
                .invalidInformationErrorMessageControl(invalidInformationErrorMessage);
    }

    @Test(description = "Boş Email Testi")
    public void EmptyEmailTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .clearEmail()
                .fillPassword("kitapyurdudeneme")
                .clickLoginButton()
                .invalidInformationErrorMessageControl(invalidInformationErrorMessage);
    }
    
    @Test(description = "Boş Şifre Testi")
    public void EmptyPasswordTEST(){
        mainPage
                .clickLoginMenu();
        loginPage
                .fillEmail("qatestdeneme@gmail.com")
                .clearPassword()
                .clickLoginButton()
                .invalidInformationErrorMessageControl(invalidInformationErrorMessage);
    }


}
