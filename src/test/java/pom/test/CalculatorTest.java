package pom.test;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.CalculatorPage;
import pom.pages.IndexPage;

public class CalculatorTest extends TestBase {

    private IndexPage indexPage;
    private final String PLUS = "plus";
    private final String TIMES = "times";
    private final String MINUS = "minus";
    private final String DIVIDE = "divide";


    @Test
    public void additionCalculator() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicCalculator();

        CalculatorPage calculatorPage = new CalculatorPage(driver);

        calculatorPage.writeNumberOne("45");
        calculatorPage.selectFunction(PLUS);
        calculatorPage.writeNumberTwo("3");
        calculatorPage.clickBtnCalculate();
        Assert.assertEquals("El resultado obtenido no es el esperado", "48", calculatorPage.getAnswer());
        Thread.sleep(3000);
    }

    @Test
    public void multiplicationCalculator() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicCalculator();

        CalculatorPage calculatorPage = new CalculatorPage(driver);

        calculatorPage.writeNumberOne("5");
        calculatorPage.selectFunction(TIMES);
        calculatorPage.writeNumberTwo("3");
        calculatorPage.clickBtnCalculate();
        Assert.assertEquals("El resultado obtenido no es el esperado", "15", calculatorPage.getAnswer());
        Thread.sleep(3000);
    }

    @Test
    public void subtractionCalculator() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicCalculator();

        CalculatorPage calculatorPage = new CalculatorPage(driver);

        calculatorPage.writeNumberOne("45");
        calculatorPage.selectFunction(MINUS);
        calculatorPage.writeNumberTwo("3");
        calculatorPage.clickBtnCalculate();
        Assert.assertEquals("El resultado obtenido no es el esperado", "42", calculatorPage.getAnswer());
        Thread.sleep(3000);
    }

    @Test
    public void divisionCalculator() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicCalculator();

        CalculatorPage calculatorPage = new CalculatorPage(driver);

        calculatorPage.writeNumberOne("45");
        calculatorPage.selectFunction(DIVIDE);
        calculatorPage.writeNumberTwo("3");
        calculatorPage.clickBtnCalculate();
        Assert.assertEquals("El resultado obtenido no es el esperado", "15", calculatorPage.getAnswer());
        Thread.sleep(3000);
    }

    public void validarIngresoPagina() {
        indexPage = new IndexPage(driver);
        Assert.assertEquals("Test Pages For Automating", indexPage.tituloIndexPage());
    }
}
