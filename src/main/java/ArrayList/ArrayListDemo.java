package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0,"Varna");
        cities.add("London");

        System.out.println(cities);

        cities.remove("London");

        System.out.printf("Cities after Brexit are: %s",cities );

        cities.remove(0);
    }

}
