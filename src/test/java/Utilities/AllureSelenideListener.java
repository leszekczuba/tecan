package Utilities;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class AllureSelenideListener implements ISuiteListener {

    @Override
    public void onStart(ISuite iSuite) {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(true)
        );
    }
}
