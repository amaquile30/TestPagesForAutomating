package withBDD.stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.pages.IndexPage;

public class Hooks {
    public static WebDriver driver;
    //private String browser= "firefox";
    private String browser = "chrome";
    //private String browser = "ninguno";

    public static IndexPage indexPage;

    @Before
    public void setUp() {

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("disable-gpu");
                driver = new ChromeDriver(chromeOptions);
        }

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static void validarIngresoPagina() {
        indexPage = new IndexPage(driver);
        Assert.assertEquals("Test Pages For Automating", indexPage.tituloIndexPage());
    }
}
