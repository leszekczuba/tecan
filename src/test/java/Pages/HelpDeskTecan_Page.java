package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

@RequiredArgsConstructor
public class HelpDeskTecan_Page {

    @Step
    public AuthenticationForm_Page clickLoginOrSignUpButton() {
        $(By.partialLinkText("log in or sign-up"))
                .click();

        return new AuthenticationForm_Page();
    }

    @Step
    public HelpDeskTecan_Page clickOnSubmitATicketButton() {
        $x("(//a[text()='Submit a ticket'])")
                .click();

        return new HelpDeskTecan_Page();
    }

    @Step
    public HelpDeskTecan_Page selectDemoRequestIssueType() {
        $x("//div[@class='choices__item choices__placeholder choices__item--selectable']")
                .click();

        SelenideElement inputField = $(By.cssSelector("input[aria-label='Please Select Type of Request']"));
                inputField.sendKeys("Demo request");
                inputField.sendKeys(Keys.ENTER);

        return new HelpDeskTecan_Page();
    }

    @Step
    public HelpDeskTecan_Page fullfillTheDemoRequestIssueTypeParametersForm() {
        $$(".choices.form-select").get(2).sendKeys("Switzerland");
        $$(".choices.form-select").get(3).sendKeys("Microplate readers");
        $(By.name("helpdesk_ticket[subject]")).sendKeys("test");
        $x("//div[@aria-label='Description, Use Alt+F10 to access formatting toolbar']").sendKeys("test description");
        $x("//input[@id='helpdesk_ticket_custom_field_cf_disclaimer_2351753']").click();
        $x("//input[@id='helpdesk_ticket_custom_field_cf_disclaimer_2_2351753']").click();

        return this;
    }
}
