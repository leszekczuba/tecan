package Pages.Elements;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.partialLinkText;

@RequiredArgsConstructor
public class TopNavigation_Bar {

    @Step
    public Service_DropDownMenu clickOnServiceDropDownMenu() {
        $(className("service-tag"))
                .click();

        return new Service_DropDownMenu();
    }

    @Step
    public TopNavigation_Bar checkTheContactButtonVisibility() {
        $(partialLinkText("Contact"))
                .shouldBe(visible);

        return this;
    }
}
