package de.conciso.cucumber;

public class Calculator {
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public int divide(int num1, int num2) {
    if (num2 == 0) {
      throw new IllegalArgumentException("Division durch Null ist nicht erlaubt");
    }
    return num1 / num2;
  }

  public int modulo(int num1, int num2) {
    if (num2 == 0) {
      throw new IllegalArgumentException("Modulo durch Null ist nicht erlaubt");
    }
    return num1 % num2;
  }

  public int power(int num1, int num2) {
    return (int) Math.pow(num1, num2);
  }
}
