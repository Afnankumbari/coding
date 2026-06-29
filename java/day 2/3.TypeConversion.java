class TypeConversion {
public static void main(String[] args) {

    // Implicit type conversion (widening)
    int num1 = 10;
    double num2 = num1; // int to double
    System.out.println("Implicit type conversion: " + num2);

    // Explicit type conversion (narrowing)
    double num3 = 9.78;
    int num4 = (int) num3; // double to int
    System.out.println("Explicit type conversion: " + num4);

    // Implicit type conversion with arithmetic operations
    int a = 5;
    double b = 2.0;
    double result = a + b; // int to double
    System.out.println("Result of arithmetic operation: " + result);
}
    
}