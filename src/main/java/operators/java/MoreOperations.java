package operators.java;

import java.util.Scanner;

public class MoreOperations {
    public static void main(String[] args) {
        PrintDayOfTheWeek(1);
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter month: ");
        int enteredMonth=scanner.nextInt();
        System.out.println("Enter year: ");
        int enteredYear=scanner.nextInt();
        PrintNumberOfDaysInTheMonth(enteredMonth,enteredYear);
        int firstNumber = 10;
        int secondNumber=6;

        System.out.println(firstNumber==secondNumber ? "Numbers are equal" : "Numbers are not equal");
        System.out.println(firstNumber>secondNumber ? "First is gather" : "Second is gather");

        if(firstNumber==secondNumber){
            System.out.println("Numbers are equal");
            System.out.println(firstNumber+secondNumber);
        }else {
            System.out.println("Numbers are not equal");
            System.out.println(firstNumber - secondNumber);
        }


    }
    public static  void PrintDayOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Selected day  is Monday");
                break;
            case 2:
                System.out.println("Selected day  is Thursday");
                break;
            case 3:
                System.out.println("Selected day  is Wednesday");
                break;
            default:
                System.out.println("Not correct option!");
        }

    }

    public static void PrintNumberOfDaysInTheMonth(int month, int year){
        int numberOfDays = 0;
        switch (month){
            case 1:
                numberOfDays = 31;
                System.out.println("Selected January and it has "+numberOfDays);
                break;
            case 2:
                if((year%4==0)&&(year%100!=0)||(year%400==0)){
                    numberOfDays=29;
                    System.out.println("Selected February and it has "+numberOfDays);

                }else{
                    numberOfDays=28;
                    System.out.println("Selected February and it has "+numberOfDays);
                }
                break;
            default:
                System.out.println("Incorrect!");
        }
    }




}
