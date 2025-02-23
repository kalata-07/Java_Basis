package loops;

public class WhileDemo {
    public static void main(String[] args) {
        int number = 1;
        while (number < 2) {
            System.out.println("Number is: " + number);
            number++;
        }
        Factorial(0);
        Factorial(1);
        Factorial(5);
    }
    public static void Factorial(int number){
        int factorial = 1;
        int iterator = number;
        while (iterator>0){
            factorial*=iterator;
            iterator--;
        }
        System.out.printf("You have entered: %d. Factorial is: %d\n", number, factorial);
    }
}

