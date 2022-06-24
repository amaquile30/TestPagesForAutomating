package pom.pages.angie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pom.pages.BasePage;

public class ButtonBasedCalculatorPage extends BasePage {
    public ButtonBasedCalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "calculated-display")
    private WebElement inputCalculator;

    @FindBy(id = "buttonplus")
    private WebElement btnButtonplus;

    @FindBy(id = "buttonminus")
    private WebElement btnButtonminus;

    @FindBy(id = "buttonmultiply")
    private WebElement btnButtonmultiply;

    @FindBy(id = "buttondivide")
    private WebElement btnButtondivide;

    @FindBy(id = "buttonequals")
    private WebElement btnButtonequals;

    @FindBy(id = "buttonallclear")
    private WebElement btnButtonallclear;

    String idNumeros = "button0";

    @FindBy(id = "button01")
    private WebElement btnButton01;

    @FindBy(id = "button02")
    private WebElement btnButton02;

    @FindBy(id = "button03")
    private WebElement btnButton03;

    @FindBy(id = "button04")
    private WebElement btnButton04;

    @FindBy(id = "button05")
    private WebElement btnButton05;

    @FindBy(id = "button06")
    private WebElement btnButton06;

    @FindBy(id = "button07")
    private WebElement btnButton07;

    @FindBy(id = "button08")
    private WebElement btnButton08;

    @FindBy(id = "button09")
    private WebElement btnButton09;

    @FindBy(id = "button00")
    private WebElement btnButton00;

    @FindBy(id = "buttondot")
    private WebElement btnButtondot;

    public void clicNumeroSegundaForma(String number) {
        clickOculto(driver.findElement(By.id(idNumeros.concat(number))));
    }

    public void clicNumero(String numero) {
        switch (numero) {
            case "1":
                //btnButton01.click();
                clickOculto(btnButton01);
                break;
            case "2":
                //btnButton02.click();
                clickOculto(btnButton02);
                break;
            case "3":
                //btnButton03.click();
                clickOculto(btnButton03);
                break;
            case "4":
                // btnButton04.click();
                clickOculto(btnButton04);
                break;
            case "5":
                //btnButton05.click();
                clickOculto(btnButton05);
                break;
            case "6":
                //btnButton06.click();
                clickOculto(btnButton06);
                break;
            case "7":
                //btnButton07.click();
                clickOculto(btnButton07);
                break;
            case "8":
                //btnButton08.click();
                clickOculto(btnButton08);
                break;
            case "9":
                //btnButton09.click();
                clickOculto(btnButton09);
                break;
            case "0":
                // btnButton00.click();
                clickOculto(btnButton00);
                break;

            default:
                Assert.fail("El numero no esta como opción");
        }


    }

    public void clicFuncion(String funcion) {
        switch (funcion) {
            case "suma":
                //btnButtonplus.click();
                clickOculto(btnButtonplus);
                break;
            case "resta":
                //btnButtonminus.click();
                clickOculto(btnButtonminus);
                break;
            case "multiplica":
                //btnButtonmultiply.click();
                clickOculto(btnButtonmultiply);
                break;
            case "divide":
                //btnButtondivide.click();
                clickOculto(btnButtondivide);
                break;
            default:
                Assert.fail("La funcion no esta como opción");


        }
    }

    public void clicIgual() {
        //btnButtonequals.click();
        clickOculto(btnButtonequals);
    }

    public String obtenerResultado() {
        System.out.println("El resultado es: " + inputCalculator.getAttribute("value"));
        return inputCalculator.getAttribute("value");
    }
}

