package pom.pages.angie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.pages.BasePage;

public class HtmlFormValidationPages extends BasePage {
    public HtmlFormValidationPages(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="firstname" )
    private WebElement inputNombre;

    @FindBy(id ="surname" )
    private WebElement inputApellido;

    @FindBy(id ="age" )
    private WebElement inputEdad;

    @FindBy(id ="country" )
    private WebElement inputCiudad;

    @FindBy(id ="notes" )
    private WebElement inputNotas;

    @FindBy(xpath ="//input[@type='submit']" )
    private WebElement botonEnviar;

    @FindBy(name="surnamevalidation" )
    private WebElement textoErrorApellido;

    public void llenarFormulario( String nombre, String apellido, String edad, String ciudad, String notas){
        inputNombre.sendKeys(nombre);
        inputApellido.sendKeys(apellido);
        inputEdad.sendKeys(edad);
        inputCiudad.click();
        selectByValue(inputCiudad,ciudad);
        inputNotas.sendKeys(notas);

    }

    public  void enviarFormularioValidacion (){
        botonEnviar.click();
    }
    public String obtenerErrorApellido (){
        return textoErrorApellido.getText();
    }


}
