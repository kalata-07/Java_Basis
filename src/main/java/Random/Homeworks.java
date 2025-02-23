package Random;

import java.util.Arrays;
import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            System.out.println("The number: ");
            number[i]= scanner.nextInt();
        }
        System.out.println(Arrays.stream(number).average());
    }
}
