package Tests;

import Base.TestBase;
import Pages.Elements.TopNavigation_Bar;
import Pages.Elements.Service_DropDownMenu;
import Pages.Tecan_HomePage;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Guice
public class HomePage_Tests extends TestBase {

    @Inject
    private Tecan_HomePage tecan_homePage = new Tecan_HomePage();
    @Inject
    private TopNavigation_Bar topNavigation_bar = new TopNavigation_Bar();
    @Inject
    private Service_DropDownMenu service_dropDownMenu = new Service_DropDownMenu();

    @Test
    public void checkContentOfTheHomePage() {
        tecan_homePage
                .checkTheShopButtonVisibility()
                .checkTheSearchBarVisibility();
        topNavigation_bar
                .checkTheContactButtonVisibility();
        tecan_homePage
                .openSupportPage();
        service_dropDownMenu
                .checkTheSupportButtonVisibility();
    }

/*    @Test
    public void searchForTheWordMagniflexAndCheckTheResults() {
        tecan_homePage
                .useSearchBarToFindResultsForMagniflexSearch();
    }*/
}
