package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {

        try {
            FileReader.readFile("asgd");
        }catch (FileNotFoundException e){
            System.out.printf("ERROR: File not found %s%n", e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }catch (IOException e){
            System.out.println("ERROR: Something went wrong whit Input/Output operations");
        }

        try {
            System.out.println(FileReader.DivideNumbers(2,0));
        }catch (CustomExceptions e){
            System.out.println(e);
        }
    }
}
