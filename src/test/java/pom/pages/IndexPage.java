package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "htmlformtest")
    private WebElement menuHtmlForm;
    @FindBy(how = How.ID, using = "calculatetest")
    private WebElement menuCalculate;
    @FindBy(linkText = "HTML Form Example")
    private WebElement lnkHtmlForm;
    @FindBy(css = "h1")
    private WebElement tituloIndex;
    @FindBy(how = How.ID,using = "inputvalidation")
    private WebElement linkHtmlFormValidation;


    public void clicHtmlForm() {
        menuHtmlForm.click();
    }
    public void clicCalculator() {
        menuCalculate.click();
    }
    public String tituloIndexPage() {
        return tituloIndex.getText();
    }
    public void clicFormValidation(){
        linkHtmlFormValidation.click();
    }
}
