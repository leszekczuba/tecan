package Tests;

import Base.TestBase;
import Pages.AuthenticationForm_Page;
import Pages.HelpDeskTecan_Page;
import Pages.Tecan_HomePage;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Guice
public class RequestSupport_Tests extends TestBase {

    @Inject
    private Tecan_HomePage tecan_homePage = new Tecan_HomePage();
    @Inject
    private HelpDeskTecan_Page helpDeskTecan_page = new HelpDeskTecan_Page();
    @Inject
    private AuthenticationForm_Page authenticationForm_page = new AuthenticationForm_Page();

    @Test
    public void checkIfServiceRequestCanBeCreated() {
        var email = "leszek.czuba@gmail.com";
        var password = "test123!";

        tecan_homePage
                .openSupportPage()
                .clickOnSupportRequestAndOpenHelpDeskPage();
        helpDeskTecan_page
                .clickLoginOrSignUpButton()
                .loginToTecanAccount(email, password)
                .clickOnSubmitATicketButton()
                .selectDemoRequestIssueType()
                .fullfillTheDemoRequestIssueTypeParametersForm();
    }
}
