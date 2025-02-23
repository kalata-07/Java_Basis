package operators.java;

public class LogicalOperations {
    public static void main(String[] args) {
        int firstNumber=10;
        int secondNumber=20;

        boolean result = false;

        System.out.println(!result);

        result=(firstNumber<secondNumber)&&!(firstNumber>secondNumber);
        System.out.println(result);
        System.out.println((firstNumber<secondNumber)&&!(firstNumber>secondNumber));

        result=(firstNumber<secondNumber)&&(firstNumber>secondNumber);
        System.out.println(result);

        result=(firstNumber>secondNumber)||(firstNumber>secondNumber);
        System.out.println(result);

        result=(firstNumber<secondNumber)||(firstNumber>secondNumber);
        System.out.println(result);
    }
}
