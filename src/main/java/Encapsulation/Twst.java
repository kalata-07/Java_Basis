package Encapsulation;

import java.util.LinkedList;
import java.util.Scanner;

public class Twst {
    public static void main(String[] args) {
        LinkedList<String> personsNames=new LinkedList<>();
        LinkedList<Integer> personsWealth=new LinkedList<>();
        LinkedList<String> personsProducts=new LinkedList<>();
        LinkedList<Integer> productsPrice=new LinkedList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter persons Line: ");
        String personsLine=scanner.nextLine();
        System.out.println("Please enter products Line: ");
        String productsLine=scanner.nextLine();

        String[] persons = splitPersons(personsLine);
        String[] products = splitProducts(productsLine);

        for (int i = 0; i < persons.length; i++) {
            personsNames.add(GetLeftPart(persons[i]));
            personsWealth.add(GetRightPart(persons[i]));
        }
        for (int i = 0; i < products.length; i++) {
            personsProducts.add(GetLeftPart(products[i]));
            productsPrice.add(GetRightPart(products[i]));
        }

        for (String person:
             personsNames) {
            System.out.println(person);
        }
        for (Integer money:
             personsWealth) {
            System.out.println(money);
        }
        for (String product:
             personsProducts) {
            System.out.println(product);
        }
        for (Integer cost:
                productsPrice) {
            System.out.println(cost);}

        /*Person elena = new Person("Elena", 11.0);
        Person alex = new Person("Alex", 4.0);

        Product coffee= new Product("Coffee", 10.0);
        Product tea = new Product("Tea", 2.0);

        elena.BuyProduct(coffee);
        alex.BuyProduct(tea);
        alex.BuyProduct(tea);
        elena.BuyProduct(tea);

        elena.PrintItemsForUser();
        alex.PrintItemsForUser();

        Person mini = new Person("Mini", 0);
        Product juice = new Product("Juice", 2);
        mini.BuyProduct(juice);
        mini.PrintItemsForUser();*/
    }

    private static String[] splitPersons(String personsEntry){
        return personsEntry.split(";");
    }

    private static String[] splitProducts(String productsEntry){
        return productsEntry.split(";");
    }

    private static String GetLeftPart(String value){
        return value.substring(0, value.indexOf("="));
    }
    private static int GetRightPart(String value){
        return Integer.parseInt(value.substring(value.indexOf("=")+1));
    }
}
