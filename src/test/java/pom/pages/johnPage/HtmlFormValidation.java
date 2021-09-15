package pom.pages.johnPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pom.pages.BasePage;

public class HtmlFormValidation extends BasePage {
    public HtmlFormValidation(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID,using = "firstname")
    private WebElement inputFirstName;
    @FindBy(how = How.ID,using = "surname")
    private WebElement inputSurname;
    @FindBy(how = How.ID,using = "age")
    private WebElement inputAge;
    @FindBy(how = How.CSS,using = "#country > option:nth-child(38)")
    private WebElement inputCountry;
    @FindBy(how = How.ID,using = "notes")
    private WebElement inputNotas;
    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/form/input[4]")
    private WebElement btnEnviar;
    @FindBy(how = How.NAME,using = "surnamevalidation")
    private WebElement errorLabelApellido;

    public void  llenarFormulario(String nombre,String apellido,String edad, String pais, String notas) throws InterruptedException {
        inputFirstName.sendKeys(nombre);
        inputSurname.sendKeys(apellido);
        inputAge.sendKeys(edad);
        inputCountry.click();
        Thread.sleep(5000);
        selectByValue(inputCountry,pais);
        inputNotas.sendKeys(notas);
        btnEnviar.click();
    }
    public String getErrorApellido(){
        return errorLabelApellido.getText();
    }

}
