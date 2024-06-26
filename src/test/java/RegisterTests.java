import Base.BaseTest;
import Pages.MainPage;
import Pages.RegisterPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {

    MainPage mainPage = new MainPage();

    RegisterPage registerPage = new RegisterPage();

    @Feature("Register Test Senaryoları")

    @Test(description = "Başarılı Kullanıcı Oluşturma Testi")
    public void UserCreateTEST() {
        mainPage
                .clickRegisterMenu();
        registerPage
                .fillFirstName("kitapyurdu")
                .fillLastName("deneme")
                .fillEmail("qatestdeneme@gmail.com")
                .fillPassword("kitapyurdudeneme")
                .fillPasswordConfirm("kitapyurdudeneme")
                .checkTerms()
                .clickSignUp();
    }

    @Test(description = "Var Olan Bilgilerle Sisteme Kayıt Testi")
    public void ExistUserTEST(){
        mainPage
                .clickRegisterMenu();
        registerPage
                .fillFirstName("kitapyurdu")
                .fillLastName("deneme")
                .fillEmail("qatestdeneme@gmail.com")
                .fillPassword("kitapyurdudeneme")
                .fillPasswordConfirm("kitapyurdudeneme")
                .checkTerms()
                .clickSignUp()
                .existUserError(existUserErrorMessage);
    }

}
