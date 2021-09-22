package pom.test.angietests;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.angie.ButtonBasedCalculatorPage;
import pom.test.TestBase;

public class ButtonBasedCalculatorTest extends TestBase {


    @Test
    public void calculatorSumar() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicButtonBasedCalculatorn();
        ButtonBasedCalculatorPage buttonBasedCalculatorPage= new ButtonBasedCalculatorPage(driver);

        buttonBasedCalculatorPage.clicNumero("2");
        buttonBasedCalculatorPage.clicFuncion("suma");
        buttonBasedCalculatorPage.clicNumero("5");
        buttonBasedCalculatorPage.clicIgual();
        Assert.assertEquals("El resultado obtenido no es el esperado", "7", buttonBasedCalculatorPage.obtenerResultado());
        Thread.sleep(3000);




    }
}
