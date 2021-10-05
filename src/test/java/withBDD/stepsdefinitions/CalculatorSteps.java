package withBDD.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.pages.IndexPage;
import pom.pages.angie.ButtonBasedCalculatorPage;

public class CalculatorSteps {

    private IndexPage indexPage;
    ButtonBasedCalculatorPage buttonBasedCalculatorPage;

    @Given("que me encuentro en la pagina de la calculadora")
    public void que_me_encuentro_en_la_pagina_de_la_calculadora() {
        Hooks.validarIngresoPagina();
        indexPage = new IndexPage(Hooks.driver);
        indexPage.clicButtonBasedCalculatorn();
    }
    @When("presiono el boton {string}")
    public void presiono_el_boton(String number) {
        buttonBasedCalculatorPage = new ButtonBasedCalculatorPage(Hooks.driver);
        buttonBasedCalculatorPage.clicNumeroSegundaForma(number);
    }
    @When("presiono el boton igual")
    public void presiono_el_boton_igual() {
        buttonBasedCalculatorPage.clicIgual();
    }
    @Then("el resultado es {string}")
    public void el_resultado_es(String resultado) {
        Assert.assertEquals("El resultado obtenido no es el esperado", resultado, buttonBasedCalculatorPage.obtenerResultado());

    }

    @And("presiono el boton de suma")
    public void presionoElBotonDeSuma() {
        buttonBasedCalculatorPage.clicFuncion("suma");

    }

    @And("presiono el boton de {string}")
    public void presionoElBotonDe(String function) {
        //completar
    }
}
