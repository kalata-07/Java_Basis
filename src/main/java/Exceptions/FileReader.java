package Exceptions;

import java.io.*;

public class FileReader {
    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp=bufferedReader.readLine())!=null){
            System.out.println(tmp);
        }
        bufferedReader.close();
        fileInputStream.close();
    }

    public static int DivideNumbers(int a, int b) throws CustomExceptions{
      try {
          return a/b;
      }catch (ArithmeticException e){
          throw new CustomExceptions(e.getMessage());
      }
    }
}
