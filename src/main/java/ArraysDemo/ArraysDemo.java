package ArraysDemo;

public class ArraysDemo {
   static String[] names=new String[3];
    static  double[] doubleNumbers= new double[5];
    static boolean [] answers = new boolean[10];

    public static void main(String[] args) {
        int [] numbers = {4,9,16,20,6};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna"};


PrintNames();
FillInNames();
PrintNames();

doubleNumbers[2]=0.7;
doubleNumbers[3]=0.4;
        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.println(doubleNumbers[i]);
        }

    }

    public static void FillInNames(){
        for (int i=0; i<names.length; i++)
            names[i]="some name";
    }

    public static void PrintNames(){
        for(int i=0; i<names.length;i++){
            System.out.println(names[1]);
        }
    }
}
