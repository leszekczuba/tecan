package Pages;

import Pages.Elements.TopNavigation_Bar;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.inject.Inject;

import static com.codeborne.selenide.Selenide.$;

@RequiredArgsConstructor
public class Tecan_HomePage {

    @Inject
    public TopNavigation_Bar topNavigation_bar = new TopNavigation_Bar();

    @Step
    public Support_Page openSupportPage() {
        topNavigation_bar
                .clickOnServiceDropDownMenu()
                .clickOnRequestSupportOption();

        return new Support_Page();
    }

    @Step
    public Tecan_HomePage checkTheShopButtonVisibility() {
        $(By.className("shop-button"))
                .shouldBe(Condition.visible);

        return this;
    }

    @Step
    public Tecan_HomePage checkTheSearchBarVisibility() {
        $(By.id("search-form"))
                .shouldBe(Condition.visible);

        return this;
    }

    @Step
    public Tecan_HomePage useSearchBarToFindResultsForMagniflexSearch() {
        $("#search-form").shouldBe(Condition.visible).click();
        SelenideElement searchInput = $("#search-input");
        searchInput.sendKeys("Magniflex");
        searchInput.sendKeys(Keys.ENTER);
        $(By.className("search-results-title"))
                .shouldHave(Condition.partialText("modular OEM solutions"));

        return this;
    }
}
