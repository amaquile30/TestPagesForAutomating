package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "number1")
    private WebElement inputNumberOne;

    @FindBy(how = How.ID, using = "number2")
    private WebElement inputNumberTwo;

    @FindBy(how = How.ID, using = "function")
    private WebElement cbFunction;

    @FindBy(how = How.ID, using = "calculate")
    private WebElement btnCalculate;

    @FindBy(how = How.ID, using = "answer")
    private WebElement lblAnswer;

    public void writeNumberOne(String number) {
        inputNumberOne.sendKeys(number);
    }

    public void writeNumberTwo(String number) {
        inputNumberTwo.sendKeys(number);
    }

    public void selectFunction(String function) {
        selectByText(cbFunction, function);
    }

    public void clickBtnCalculate() {
        btnCalculate.click();
    }

    public String getAnswer() {
        return lblAnswer.getText();
    }
}
