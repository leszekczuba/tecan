package Base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public abstract class UserAlreadyLoggedInTests {

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.tecan.com/");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
