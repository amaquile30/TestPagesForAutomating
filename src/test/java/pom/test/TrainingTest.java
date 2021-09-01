package pom.test;

import org.junit.Assert;
import org.junit.Test;
import pom.pages.BasicHtmlFormPage;
import pom.pages.IndexPage;

public class TrainingTest extends TestBase {

    private IndexPage indexPage;

    @Test
    public void llenarFormularioHtml() throws InterruptedException {
        validarIngresoPagina();
        indexPage.clicHtmlForm();

        BasicHtmlFormPage basicHtmlFormPage = new BasicHtmlFormPage(driver);
        basicHtmlFormPage.escribirUsuario("ana");
        basicHtmlFormPage.escribirClave("1234");
        basicHtmlFormPage.escribirComentarios("comentariosssssss");
        basicHtmlFormPage.selectMultipleSelect("Selection Item 2");
        basicHtmlFormPage.selectDropdown("dd2");

        Thread.sleep(3000);
    }

    public void validarIngresoPagina() {
        indexPage = new IndexPage(driver);
        Assert.assertEquals("Test Pages For Automating", indexPage.tituloIndexPage());
    }
}
