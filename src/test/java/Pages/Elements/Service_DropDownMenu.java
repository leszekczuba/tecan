package Pages.Elements;

import Pages.Support_Page;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@RequiredArgsConstructor
public class Service_DropDownMenu {

    @Step
    public Support_Page clickOnRequestSupportOption() {
        $(By.partialLinkText("Request support"))
                .click();

        return new Support_Page();
    }

    @Step
    public Service_DropDownMenu dropDownMenuIsExpanded() {
        $(By.className("drop-down ddService drop-it")).shouldBe(visible);
        return this;
    }

    @Step
    public Service_DropDownMenu checkTheSupportButtonVisibility() {
        $(By.className("support"))
                .shouldBe(visible);

        return this;
    }
}
