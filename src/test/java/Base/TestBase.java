package Base;

import com.codeborne.selenide.Configuration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeClass
    //@Parameters("browser")
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.tecan.com/");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

/*    public static WebDriver driver; // is static because ExtentReportManager class create object of TestBase so then there are two drivers initialized and there is conflict

    public Logger logger;

    public ResourceBundle rb;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String br) {
        rb = ResourceBundle.getBundle("config"); // load config.properties file to use its variables
        logger = LogManager.getLogger(this.getClass()); //the class that is executing will be added to log file to know to which class logs are dedicated

        if (br.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); //to disable browser info saying "Chrome is being controlled by automated test software".
            driver = new ChromeDriver(options);
        } else if (br.equals("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.setAcceptInsecureCerts(true);
            driver = new EdgeDriver(options);
        } else if (br.equals("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.setAcceptInsecureCerts(true);
            driver = new FirefoxDriver(options);
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get(rb.getString("appURL")); //make use of variables from config.properties
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public String randomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

    public String randomNumber() {
        String generatedString2 = RandomStringUtils.randomNumeric(10);
        return (generatedString2);
    }

    public String randomAlphaNumeric() {
        String str = RandomStringUtils.randomAlphabetic(5);
        String num = RandomStringUtils.randomNumeric(10);
        return (str + num);
    }

    public String captureScreen(String tname) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }
        return destination;

    }*/
}
