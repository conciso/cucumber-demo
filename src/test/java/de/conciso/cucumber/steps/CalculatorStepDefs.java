package de.conciso.cucumber.steps;

import de.conciso.cucumber.Calculator;
import io.cucumber.java.de.Angenommen;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Wenn;
import org.junit.Assert;

public class CalculatorStepDefs {
  private Calculator calculator;
  private int result;

  @Angenommen("der Taschenrechner ist eingeschaltet")
  public void given_the_calculator_is_on() {
    calculator = new Calculator();
  }

  @Wenn("ich {int} und {int} addiere")
  public void add(int num1, int num2) {
    result = calculator.add(num1, num2);
  }

  @Dann("muss das Ergebnis {int} sein")
  public void the_result_should_be(int expected) {
    Assert.assertEquals(expected, result);
  }
}
