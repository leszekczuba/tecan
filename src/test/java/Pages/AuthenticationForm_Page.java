package Pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.inject.Inject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@RequiredArgsConstructor
public class AuthenticationForm_Page {

    @Inject
    private HelpDeskTecan_Page helpDeskTecan_page = new HelpDeskTecan_Page();

    @Step
    public HelpDeskTecan_Page loginToTecanAccount(String email, String password) {
        $(By.name("email"))
                .setValue(email);
        $(By.name("password"))
                .setValue(password);
        $(By.name("submit"))
                .click();
        $("h1")
                .shouldHave(Condition.text("Hi, How can we help you?"));

        return helpDeskTecan_page;
    }
}
