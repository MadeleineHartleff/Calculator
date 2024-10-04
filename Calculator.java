public class Calculator {

  // Konstruktor
  public Calculator() {
  }

  // Methoden für die Berechnungen
  public int add(int a, int b) {
    int resultAdd = a + b;
    return resultAdd;
  }

  public int subtract(int a, int b) {
    int resultSub = a - b;
    return resultSub;
  }

  public int multiply(int a, int b) {
    int resultMul = a * b;
    return resultMul;
  }

  public int divide(int a, int b) {
    int resultDiv = a / b;
    return resultDiv;
  }

  public int modulo(int a, int b) {
    int resultMod = a % b;
    return resultMod;
  }

  // Hauptmethode
  public static void main(String[] args) {
  Calculator myCalculator = new Calculator();
  
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45, 11));
  System.out.println(myCalculator.multiply(4, 3));
  System.out.println(myCalculator.divide(40, 8));
  System.out.println(myCalculator.modulo(80, 6));
  }
}
