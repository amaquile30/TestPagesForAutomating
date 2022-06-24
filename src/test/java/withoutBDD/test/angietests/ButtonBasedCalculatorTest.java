package withoutBDD.test.angietests;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.angie.ButtonBasedCalculatorPage;
import withoutBDD.test.TestBase;

public class ButtonBasedCalculatorTest extends TestBase {


    @Test
    public void calculatorSumar() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicButtonBasedCalculatorn();
        ButtonBasedCalculatorPage buttonBasedCalculatorPage = new ButtonBasedCalculatorPage(driver);
        buttonBasedCalculatorPage.clicNumeroSegundaForma("2");
        buttonBasedCalculatorPage.clicFuncion("suma");
        buttonBasedCalculatorPage.clicNumeroSegundaForma("5");
        buttonBasedCalculatorPage.clicIgual();
        Assert.assertEquals("El resultado obtenido no es el esperado", "7", buttonBasedCalculatorPage.obtenerResultado());
        Thread.sleep(3000);

    }
    @Test
    public void calculatorRestar() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicButtonBasedCalculatorn();
        ButtonBasedCalculatorPage buttonBasedCalculatorPage = new ButtonBasedCalculatorPage(driver);
        buttonBasedCalculatorPage.clicNumero("8");
        buttonBasedCalculatorPage.clicFuncion("resta");
        buttonBasedCalculatorPage.clicNumero("3");
        buttonBasedCalculatorPage.clicIgual();
        Assert.assertEquals("El resultado obtenido no es el esperado", "5", buttonBasedCalculatorPage.obtenerResultado());
        Thread.sleep(3000);

    }
    @Test
    public void calculatorMultiplicar () throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicButtonBasedCalculatorn();
        ButtonBasedCalculatorPage buttonBasedCalculatorPage = new ButtonBasedCalculatorPage(driver);
        buttonBasedCalculatorPage.clicNumero("4");
        buttonBasedCalculatorPage.clicFuncion("multiplica");
        buttonBasedCalculatorPage.clicNumero("6");
        buttonBasedCalculatorPage.clicIgual();
        Assert.assertEquals("El resultado obtenido no es el esperado", "24", buttonBasedCalculatorPage.obtenerResultado());
        Thread.sleep(3000);

    }
    @Test
    public void calculatorDividir () throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicButtonBasedCalculatorn();
        ButtonBasedCalculatorPage buttonBasedCalculatorPage = new ButtonBasedCalculatorPage(driver);
        buttonBasedCalculatorPage.clicNumero("0");
        buttonBasedCalculatorPage.clicFuncion("divide");
        buttonBasedCalculatorPage.clicNumero("9");
        buttonBasedCalculatorPage.clicIgual();
        Assert.assertEquals("El resultado obtenido no es el esperado", "0", buttonBasedCalculatorPage.obtenerResultado());
        Thread.sleep(3000);

    }

}
