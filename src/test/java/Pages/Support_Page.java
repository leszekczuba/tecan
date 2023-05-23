package Pages;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

@RequiredArgsConstructor
public class Support_Page {

    @Step("Click on 'Support Request' link")
    public HelpDeskTecan_Page clickOnSupportRequestAndOpenHelpDeskPage() {
        $(By.partialLinkText("Support request"))
                .click();
        switchTo().window(1);

        return new HelpDeskTecan_Page();
    }
}
