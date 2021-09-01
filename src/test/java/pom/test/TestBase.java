package pom.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.pages.IndexPage;

public class TestBase {

    public WebDriver driver;
    //private String browser= "firefox";
    private String browser = "chrome";

    public IndexPage indexPage;


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
            default:
                Assert.fail("El navegador no esta como opción");
        }

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void validarIngresoPagina() {
        indexPage = new IndexPage(driver);
        Assert.assertEquals("Test Pages For Automating", indexPage.tituloIndexPage());
    }
}
