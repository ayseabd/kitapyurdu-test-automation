import Base.BaseTest;
import Pages.MainPage;
import Pages.SearchResultsPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

@Feature("Search Test Senaryoları")

    @Test(description = "Arama Sonucunun Bulunması Testi")
    public void ItemFoundTEST(){
        mainPage
                .fillSearchBox("Görme Biçimleri")
                .clickSearchButton();
        searchResultsPage
                .searchFound(searchFoundText);

    }

    @Test(description = "Arama Sonucunun Bulunmaması Testi")
    public void ItemNotFoundTEST(){
        mainPage
                .fillSearchBox("Breasts and Eggs")
                .clickSearchButton();
        searchResultsPage
                .searchNotFound(searchNotFoundText);
    }

    @Test(description = "Arama ve Sonucun Eşleşmesi Testi" )
    public void SearchAndResultMatchTEST(){
        mainPage
                .fillSearchBox("Görme Biçimleri")
                .clickSearchButton();
        searchResultsPage
                .searchMatch();
    }

}
