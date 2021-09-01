package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasicHtmlFormPage extends BasePage {

    public BasicHtmlFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "username")
    private WebElement inputUserName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement inputPassword;

    @FindBy(how = How.NAME, using = "comments")
    private WebElement inputComments;

    @FindBy(how = How.NAME, using = "multipleselect[]")
    private WebElement multipleSelect;

    @FindBy(how = How.NAME, using = "dropdown")
    private WebElement dropdown;


    public void escribirUsuario(String user) {
        inputUserName.sendKeys(user);
    }

    public void escribirClave(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void escribirComentarios(String comentario) {
        inputComments.sendKeys(comentario);
    }

    public void selectMultipleSelect(String text) {
        selectByText(multipleSelect, text);
    }

    public void selectDropdown(String value) {
        dropdown.click();
        selectByValue(dropdown, value);
    }
}
