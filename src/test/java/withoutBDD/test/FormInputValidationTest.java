package withoutBDD.test;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.johnPage.HtmlFormValidation;

public class FormInputValidationTest extends TestBase {

    @Test
    public void llenarFormulario(){
        validarIngresoPagina();
        indexPage.clicFormValidation();
        HtmlFormValidation htmlFormValidation = new HtmlFormValidation(driver);
        htmlFormValidation.llenarFormulario("John","Leal","31","Colombia","Hello World");
        Assert.assertEquals("error no se encontro el objeto","Surname provided is too short",htmlFormValidation.getErrorApellido());
    }

}
