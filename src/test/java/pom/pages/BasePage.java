package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void selectByValue(WebElement element, String value) {
        Select selectOne = new Select(element);
        selectOne.selectByValue(value);
    }

    protected void selectByText(WebElement element, String text) {
        Select selectOne = new Select(element);
        selectOne.selectByVisibleText(text);
    }
}
