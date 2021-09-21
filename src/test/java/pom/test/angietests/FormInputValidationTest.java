package pom.test.angietests;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.angie.HtmlFormValidationPages;
import pom.test.TestBase;

public class FormInputValidationTest extends TestBase {

    @Test
    public void llenarFormularioValidacion () throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicHtmlFormValidation();

        HtmlFormValidationPages htmlFormValidationPages= new HtmlFormValidationPages(driver);
        htmlFormValidationPages.llenarFormulario("angie","correa", "30", "Armenia", "por fin estoy entendiendo jajaja...");
        htmlFormValidationPages.enviarFormularioValidacion();
        Assert.assertEquals("El resultado obtenido no es el esperado", "Surname provided is too short", htmlFormValidationPages.obtenerErrorApellido());
        Thread.sleep(3000);
    }
}
